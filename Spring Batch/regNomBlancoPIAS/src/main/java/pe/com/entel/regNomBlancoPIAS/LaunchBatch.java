package pe.com.entel.regNomBlancoPIAS;

/**
 * Created by PZF on 24/05/2019.
 */

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import pe.com.entel.regNomBlancoPIAS.util.Constants;

import java.io.File;

@Component
public class LaunchBatch {

    @Autowired
    private ApplicationContext applicationContext;

    private static Logger logger = Logger.getLogger(LaunchBatch.class);

    public static void main(String[] args) {
        String[] springConfig = {"applicationContext-job.xml"};

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

        LaunchBatch launch = context.getBean(LaunchBatch.class);
        launch.run();
    }

    public void run() {
        try {
            logger.info("## INICIO Proceso de regularización de nombres de clientes en blanco en PIAS ##");

            JobLauncher jobLauncher = (JobLauncher) this.applicationContext.getBean("jobLauncher");

            String dirFiles = System.getProperty(Constants.REG_NOM_BLANCO_PIAS_DIR_FILES);
            Long numcontrolid = Long.parseLong(System.getProperty(Constants.REG_NOM_BLANCO_PIAS_NUMCONTROLID));

            logger.info("dirFiles = " + dirFiles);
            logger.info("numcontrolid = " + numcontrolid);

            File dirFile = new File(dirFiles);
            File[] files = dirFile.listFiles();

            if ((files == null) || (files.length == 0)) {
                logger.info("No se ha encontrado archivo csv para procesar, se extraerá clientes a procesar de PIAS ...");
                Job job = (Job) this.applicationContext.getBean("regNomBlancoPIAS");
                JobExecution jobExecution = null;
                try {
                    logger.info("[JOB][PROCESS] Procesando Job ... " + job.getName());
                    jobExecution = jobLauncher.run(job, new JobParameters());
                } catch (Throwable t) {
                    logger.error(t.getMessage(), t);
                } finally {
                    logger.info("Job finalizado. Status " + jobExecution.getStatus());
                }
            } else if (files.length > 1) {
                logger.error("Se ha encontrado más de un archivo csv para procesar, por favor solo coloque un único archivo csv ...");
            } else {
                String fileName = files[0].getName();
                logger.info("Se ha encontrado un archivo csv para procesar: " + fileName + " ...");
                Job job = (Job) this.applicationContext.getBean("regNomBlancoCSV");
                JobParameters jobParameters = new JobParametersBuilder().addString("dirFiles", dirFiles).addString("fileName", fileName).toJobParameters();
                JobExecution jobExecution = null;
                try {
                    logger.info("[JOB][PROCESS] Procesando Job ... " + job.getName());
                    jobExecution = jobLauncher.run(job, jobParameters);
                } catch (Throwable t) {
                    logger.error(t.getMessage(), t);
                } finally {
                    logger.info("Job finalizado. Status " + jobExecution.getStatus());
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            logger.info("## FIN Proceso de regularización de nombres de clientes en blanco en PIAS ##");
            ((ClassPathXmlApplicationContext) this.applicationContext).close();
        }

    }
}
