package pe.com.entel.regNomBlancoPIAS.listener;

import org.apache.log4j.Logger;
import org.springframework.batch.core.ItemWriteListener;
import pe.com.entel.regNomBlancoPIAS.bean.ClienteBean;

import java.util.List;

public class ClienteItemWriterListener implements ItemWriteListener<ClienteBean> {

    Logger logger = Logger.getLogger(ClienteItemWriterListener.class);

    public void beforeWrite(List<? extends ClienteBean> items) {
    }

    public void afterWrite(List<? extends ClienteBean> items) {
        logger.info("Se han regularizado " + ((items != null) ? items.size() : 0) + " clientes");
    }

    public void onWriteError(Exception exception, List<? extends ClienteBean> items) {
        logger.info("Error al momento de regularizar la informacion de los clientes : ");
        for (ClienteBean b : items) {
            logger.info("Item : " + b.toString());
        }
    }
}
