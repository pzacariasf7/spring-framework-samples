package pe.com.entel.proxy.consultaInformacionService.wsp_consultaInformacionService.service;

import org.datacontract.schemas._2004._07.wsser.*;
import org.tempuri.IConsultaInformacionService;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;

public class ConsultaReniecService {

    private String serviceUrl;
    private ObjectFactory objectFactory;

    private String datoConsultaAplicativo;
    private Long cantidadItem;
    private String datoConsultaClave;
    private String datoConsultaTipoPlan;
    private String datoConsultaUsuario;

    private String variablesReglaCantidad;
    private String variablesReglaGama;

    public ConsultaReniecService(String serviceUrl, String datoConsultaAplicativo, Long cantidadItem, String datoConsultaClave, String datoConsultaTipoPlan, String datoConsultaUsuario, String variablesReglaCantidad, String variablesReglaGama) {
        this.serviceUrl = serviceUrl;
        this.objectFactory = new ObjectFactory();
        this.datoConsultaAplicativo = datoConsultaAplicativo;
        this.cantidadItem = cantidadItem;
        this.datoConsultaClave = datoConsultaClave;
        this.datoConsultaTipoPlan = datoConsultaTipoPlan;
        this.datoConsultaUsuario = datoConsultaUsuario;

        this.variablesReglaCantidad = variablesReglaCantidad;
        this.variablesReglaGama = variablesReglaGama;
    }

    public ConsultaConsolidadoResp consultarConsolidadoByDni(String dni) {

        ConsultaRequest request;
        ConsultaConsolidadoResp response = null;

        try {
            request = prepareRQConsultarConsolidadoByDni(dni);
            response = invokeConsultarConsolidado(request);
        } catch (Exception e) {
            System.err.println("Error: " + e.getLocalizedMessage());
        }

        return response;
    }

    private ConsultaRequest prepareRQConsultarConsolidadoByDni(String dni) {
        DatoConsulta datoConsulta = objectFactory.createDatoConsulta();
        datoConsulta.setAplicativo(objectFactory.createDatoConsultaAplicativo(datoConsultaAplicativo));
        datoConsulta.setCantidadItem(cantidadItem);
        datoConsulta.setClave(objectFactory.createDatoConsultaClave(datoConsultaClave));
        datoConsulta.setDni(objectFactory.createDatoConsultaDni(dni));
        datoConsulta.setTipoPlan(objectFactory.createDatoConsultaTipoPlan(datoConsultaTipoPlan));
        datoConsulta.setUsuario(objectFactory.createDatoConsultaUsuario(datoConsultaUsuario));

        JAXBElement<DatoConsulta> datoConsultaJAXBElement = objectFactory.createDatoConsulta(datoConsulta);

        ArrayOfVariablesRegla arrayOfVariablesRegla = objectFactory.createArrayOfVariablesRegla();

        VariablesRegla variablesRegla = objectFactory.createVariablesRegla();
        variablesRegla.setCantidad(objectFactory.createVariablesReglaCantidad(variablesReglaCantidad));
        variablesRegla.setGama(objectFactory.createVariablesReglaGama(variablesReglaGama));

        arrayOfVariablesRegla.getVariablesRegla().add(variablesRegla);
        JAXBElement<ArrayOfVariablesRegla> arrayOfVariablesReglaJAXBElement = objectFactory.createConsultaRequestVariableRegla(arrayOfVariablesRegla);

        ConsultaRequest consultaRequest = objectFactory.createConsultaRequest();

        consultaRequest.setDatoConsulta(datoConsultaJAXBElement);
        consultaRequest.setVariableRegla(arrayOfVariablesReglaJAXBElement);

        return consultaRequest;
    }

    private ConsultaConsolidadoResp invokeConsultarConsolidado(ConsultaRequest request) {
        org.tempuri.ConsultaInformacionService service = new org.tempuri.ConsultaInformacionService();
        IConsultaInformacionService iConsultaInformacionService = service.getBasicHttpBindingIConsultaInformacionService();

        BindingProvider bindingProvider = (BindingProvider) iConsultaInformacionService;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.serviceUrl);

        ConsultaConsolidadoResp consultarConsolidadoResp = iConsultaInformacionService.consultarConsolidado(request);

        return consultarConsolidadoResp;
    }

}
