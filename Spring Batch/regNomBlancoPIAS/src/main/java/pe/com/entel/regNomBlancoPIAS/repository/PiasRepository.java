package pe.com.entel.regNomBlancoPIAS.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.com.entel.regNomBlancoPIAS.persistence.pias.PiasMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PZF on 26/05/2019.
 */

@Repository
public class PiasRepository {

    Logger logger = Logger.getLogger(PiasRepository.class);

    @Autowired
    private PiasMapper piasMapper;

    public void buscarCliente(Map<String, Object> mapCliente) {
        try {
            piasMapper.buscarCliente(mapCliente);
        } catch (Exception e) {
            logger.error(e.getMessage());
            mapCliente.put("error", e.getMessage());
        }
    }

}
