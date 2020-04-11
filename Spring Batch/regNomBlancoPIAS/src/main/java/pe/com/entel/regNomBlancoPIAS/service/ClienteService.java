package pe.com.entel.regNomBlancoPIAS.service;

import org.apache.log4j.Logger;
import org.datacontract.schemas._2004._07.wsser.ConsultaConsolidadoResp;
import org.datacontract.schemas._2004._07.wsser.DatoPersona;
import org.datacontract.schemas._2004._07.wsser.DatoResultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.entel.proxy.consultaInformacionService.wsp_consultaInformacionService.service.ConsultaReniecService;
import pe.com.entel.regNomBlancoPIAS.repository.PiasRepository;
import pe.com.entel.regNomBlancoPIAS.util.Constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PZF on 26/05/2019.
 */
@Service
public class ClienteService {

    private static Logger logger = Logger.getLogger(ClienteService.class);

    @Autowired
    private PiasRepository piasRepository;

    ConsultaReniecService consultaReniecService;

    private String reniecUrl;
    private String datoConsultaAplicativo;
    private Long cantidadItem;
    private String datoConsultaClave;
    private String datoConsultaTipoPlan;
    private String datoConsultaUsuario;

    private String variablesReglaCantidad;
    private String variablesReglaGama;

    public ClienteService() {
        reniecUrl = System.getProperty(Constants.REG_NOM_BLANCO_PIAS_RENIEC_URL);
        datoConsultaAplicativo = System.getProperty(Constants.REG_NOM_BLANCO_PIAS_RENIEC_APLICATIVO);
        cantidadItem = Long.parseLong(System.getProperty(Constants.REG_NOM_BLANCO_PIAS_RENIEC_CANTIDADITEM));
        datoConsultaClave = System.getProperty(Constants.REG_NOM_BLANCO_PIAS_RENIEC_CLAVE);
        datoConsultaTipoPlan = System.getProperty(Constants.REG_NOM_BLANCO_PIAS_RENIEC_TIPOPLAN);
        datoConsultaUsuario = System.getProperty(Constants.REG_NOM_BLANCO_PIAS_RENIEC_USUARIO);
        variablesReglaCantidad = System.getProperty(Constants.REG_NOM_BLANCO_PIAS_RENIEC_REGLACANTIDAD);
        variablesReglaGama = System.getProperty(Constants.REG_NOM_BLANCO_PIAS_RENIEC_REGLAGAMA);

        consultaReniecService = new ConsultaReniecService(
                reniecUrl, datoConsultaAplicativo, cantidadItem, datoConsultaClave, datoConsultaTipoPlan,
                datoConsultaUsuario, variablesReglaCantidad, variablesReglaGama);
    }

    public Map<String, Object> buscarCliente(String tipoDoc, String numDoc) {
        Map<String, Object> mapCliente = new HashMap<String, Object>();
        try {
            mapCliente.put("tipoDoc", tipoDoc);
            mapCliente.put("numDoc", numDoc);
            piasRepository.buscarCliente(mapCliente);
        } catch (Exception e) {
            logger.error(e.getMessage());
            mapCliente.put("error", e.getMessage());
        }
        return mapCliente;
    }

    public Map<String, Object> buscarClienteRENIEC(String tipoDoc, String numDoc) {
        Map<String, Object> mapCliente = new HashMap<String, Object>();

        try {
            if (tipoDoc.equals(Constants.RUC)) {
                numDoc = numDoc.substring(2, 10);
            }

            ConsultaConsolidadoResp consultaConsolidadoResp = consultaReniecService.consultarConsolidadoByDni(numDoc);

            DatoResultado datoResultado = consultaConsolidadoResp.getDatoResultado().getValue();

            if (datoResultado.getResultado().getValue().equals(Constants.RENIEC_OK)) {
                DatoPersona datoPersona = consultaConsolidadoResp.getDatoPersona().getValue();

                mapCliente.put("firstname", datoPersona.getNombres().getValue().trim());
                mapCliente.put("lastname", datoPersona.getApellidoPaterno().getValue().trim());
                mapCliente.put("lastname2", datoPersona.getApellidoMaterno().getValue().trim());

                mapCliente.put("name", ((String)mapCliente.get("firstname") + " " + (String)mapCliente.get("lastname") + " " + (String)mapCliente.get("lastname2")).trim());
            } else {
                mapCliente.put("error", datoResultado.getResultado().getValue() + " - " + datoResultado.getResultadoDescripcion().getValue());
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            mapCliente.put("error", e.getMessage());
        }

        return mapCliente;
    }

}
