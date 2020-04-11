package pe.com.entel.proxy.consultaInformacionService.wsp_consultaInformacionService.main;

import org.datacontract.schemas._2004._07.wsser.ConsultaConsolidadoResp;
import org.datacontract.schemas._2004._07.wsser.DatoPersona;
import org.datacontract.schemas._2004._07.wsser.DatoResultado;
import pe.com.entel.proxy.consultaInformacionService.wsp_consultaInformacionService.service.ConsultaReniecService;

public class Main {

    public static void main(String[] args) {
        ConsultaReniecService consultaReniecService = new ConsultaReniecService("http://14.240.4.208:8083/ConsultaInformacionService.svc?wsdl",
                "CRM", 1l, "123456", "UNICA", "USUARIO1", "1", "UNICA");

        ConsultaConsolidadoResp consultaConsolidadoResp = consultaReniecService.consultarConsolidadoByDni("46422095");

        DatoResultado datoResultado = consultaConsolidadoResp.getDatoResultado().getValue();
        DatoPersona datoPersona = consultaConsolidadoResp.getDatoPersona().getValue();

        System.out.println(datoResultado.getResultado().getValue());
        System.out.println(datoResultado.getResultadoDescripcion().getValue());
        System.out.println(datoPersona.getApellidoPaterno().getValue());
        System.out.println(datoPersona.getApellidoMaterno().getValue());
        System.out.println(datoPersona.getNombres().getValue());
    }
}
