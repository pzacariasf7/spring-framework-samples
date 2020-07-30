package pe.com.entel.appfilemerger.AppFileMerger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.com.entel.appfilemerger.AppFileMerger.service.FileMergerService;
import pe.com.entel.appfilemerger.AppFileMerger.util.Constant;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AppfilemergerApplication {

	FileMergerService fileMergerService;

	public static void main(String[] args) {
		SpringApplication.run(AppfilemergerApplication.class, args);
		System.out.println("===============");
		System.out.println(Constant.RUTA_CL);
		System.out.println(Constant.OPERADORES);

		try{
			AppfilemergerApplication appfilemergerApplication = new AppfilemergerApplication();
			appfilemergerApplication.process();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}

	public void process() throws Exception {
		System.out.println("INICIO PROCESO");
		fileMergerService = new FileMergerService();
		List<String> listOLD = Arrays.asList(Constant.OPERADORES.trim().split("\\|"));

		for (String codeOLD: listOLD) {
			fileMergerService.processValidate(codeOLD);
			System.out.println("-----");
		}
	}

}
