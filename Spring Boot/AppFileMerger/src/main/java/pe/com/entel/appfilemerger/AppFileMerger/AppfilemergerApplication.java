package pe.com.entel.appfilemerger.AppFileMerger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pe.com.entel.appfilemerger.AppFileMerger.service.FileMergerService;
import pe.com.entel.appfilemerger.AppFileMerger.util.Constant;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AppfilemergerApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(AppfilemergerApplication.class);

	@Autowired
	FileMergerService fileMergerService;

	@Bean
	public SimpleDateFormat formatterYYMMdd() {
		return new SimpleDateFormat("YYMMdd");
	}

	@Bean
	public SimpleDateFormat formatterDDMMYYYY() {
		return new SimpleDateFormat("dd/MM/YYYY");
	}

	public static void main(String[] args) {
		SpringApplication.run(AppfilemergerApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		logger.info("===================AppFileMerger INI===================");
		try{
			List<String> listOLD = Arrays.asList(Constant.OPERADORES.trim().split("\\|"));

			for (String codeOLD: listOLD) {
				fileMergerService.processMerge(codeOLD);
			}
		} catch (Exception e) {
			logger.error("Error: " + e.getMessage());
		}
		logger.info("===================AppFileMerger FIN===================");
	}

}
