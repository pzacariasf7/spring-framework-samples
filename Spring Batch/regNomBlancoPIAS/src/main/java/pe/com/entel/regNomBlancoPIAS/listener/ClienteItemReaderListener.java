package pe.com.entel.regNomBlancoPIAS.listener;

import org.apache.log4j.Logger;
import org.springframework.batch.core.ItemReadListener;
import org.springframework.batch.item.file.FlatFileParseException;
import pe.com.entel.regNomBlancoPIAS.bean.ClienteBean;

public class ClienteItemReaderListener implements ItemReadListener<ClienteBean> {

    Logger logger = Logger.getLogger(ClienteItemReaderListener.class);

    public void beforeRead() {
    }

    public void afterRead(ClienteBean item) {
    }

    public void onReadError(Exception ex) {
        logger.info("Cliente le�do con error debido a una excepci�n :  " + ex.getLocalizedMessage() + " CAUSA: " + ex.getCause().getMessage());
    }
}
