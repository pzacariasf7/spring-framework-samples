package pe.com.entel.regNomBlancoPIAS.processor;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.entel.regNomBlancoPIAS.bean.ClienteBean;
import pe.com.entel.regNomBlancoPIAS.service.ClienteService;
import pe.com.entel.regNomBlancoPIAS.util.Constants;

import java.util.Map;

public class ClienteItemProcessor implements ItemProcessor<ClienteBean, ClienteBean> {

    Logger logger = Logger.getLogger(ClienteItemProcessor.class);

    @Autowired
    private ClienteService clienteService;

    private Long numControlId;

    public ClienteItemProcessor(){
        numControlId = Long.parseLong(System.getProperty(Constants.REG_NOM_BLANCO_PIAS_NUMCONTROLID));
    }

    public ClienteBean process(ClienteBean clienteBean) throws Exception {

        String tipoDoc = clienteBean.getVchTipoDoc();
        String numDoc = clienteBean.getVchNumDoc();

        if (!esDNI_RUC10(tipoDoc, numDoc)) {
            return null;
        }

        clienteBean.setNumControlId(numControlId);
        clienteBean.setVchApplication(Constants.REG_NOM_BLANCO_PIAS);

        Map<String, Object> mapCliente = clienteService.buscarCliente(tipoDoc, numDoc);

        if (mapCliente != null) {
            String error = (mapCliente.get("error") == null) ? "" : (String) mapCliente.get("error");

            if (error.isEmpty()) {
                clienteBean.setNumEstado(Constants.estadoProcesadoOK);
                clienteBean.setVchApi(Constants.API_UOA_CLIENTE);
                clienteBean.setVchName((String) mapCliente.get("name"));
                clienteBean.setVchFirstname((String) mapCliente.get("firstname"));
                clienteBean.setVchLastname((String) mapCliente.get("lastname"));
                clienteBean.setVchLastname2((String) mapCliente.get("lastname2"));
            } else if (error.equals(Constants.errorProcesadoNoOK)){
                //noBuscarClienteRENIEC
                clienteBean.setNumEstado(Constants.estadoProcesadoNoOK);
                clienteBean.setVchApi(Constants.API_UOA_CLIENTE);
                clienteBean.setVchError(Constants.mensajeProcesadoNoOK);
            } else {
                //buscarClienteRENIEC
                mapCliente = clienteService.buscarClienteRENIEC(tipoDoc, numDoc);

                if (mapCliente != null) {
                    error = (mapCliente.get("error") == null) ? "" : (String) mapCliente.get("error");

                    if (error.isEmpty()) {
                        clienteBean.setNumEstado(Constants.estadoProcesadoOK);
                        clienteBean.setVchApi(Constants.API_RENIEC);
                        clienteBean.setVchName((String) mapCliente.get("name"));
                        clienteBean.setVchFirstname((String) mapCliente.get("firstname"));
                        clienteBean.setVchLastname((String) mapCliente.get("lastname"));
                        clienteBean.setVchLastname2((String) mapCliente.get("lastname2"));
                    } else {
                        clienteBean.setNumEstado(Constants.estadoProcesadoNoOK);
                        clienteBean.setVchApi(Constants.API_RENIEC);
                        clienteBean.setVchError(error);
                    }
                }

            }
        }

        return clienteBean;
    }

    private boolean esDNI_RUC10(String tipoDoc, String numDoc) {
        boolean esDNI_RUC10 = true;
        if (tipoDoc != null && numDoc != null) {
            if (!tipoDoc.equals(Constants.DNI) && !tipoDoc.equals(Constants.RUC)) {
                esDNI_RUC10 = false;
            } else if (tipoDoc.equals(Constants.RUC)) {
                if (!numDoc.startsWith(Constants.RUC10)) {
                    esDNI_RUC10 = false;
                }
            }
        } else {
            esDNI_RUC10 = false;
        }
        return esDNI_RUC10;
    }
}
