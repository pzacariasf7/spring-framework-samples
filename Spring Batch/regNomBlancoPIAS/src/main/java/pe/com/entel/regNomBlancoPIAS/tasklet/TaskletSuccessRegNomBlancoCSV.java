package pe.com.entel.regNomBlancoPIAS.tasklet;

import org.apache.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.File;

/**
 * Created by PZF on 05/06/2019.
 */
public class TaskletSuccessRegNomBlancoCSV implements Tasklet {

    Logger logger = Logger.getLogger(TaskletSuccessRegNomBlancoCSV.class);

    private String fileName;
    private String dirFiles;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDirFiles(String dirFiles) {
        this.dirFiles = dirFiles;
    }

    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        logger.info("Archivo " + this.fileName + " procesado correctamente ...");
        File file;
        try {
            file = new File(dirFiles + File.separator + fileName);
            file.delete();
            logger.info("Archivo " + this.fileName + " eliminado correctamente ...");
        } catch (Exception e) {
            logger.error("Error al eliminar archivo " + this.fileName + ": " + e.getMessage());
        }
        return null;
    }
}
