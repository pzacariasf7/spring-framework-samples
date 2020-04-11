package pe.com.entel.regNomBlancoPIAS.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
import pe.com.entel.regNomBlancoPIAS.bean.ClienteBean;
import pe.com.entel.regNomBlancoPIAS.util.Constants;

public class ClienteFieldSetMapper implements FieldSetMapper<ClienteBean> {

    public ClienteBean mapFieldSet(FieldSet fieldSet) throws BindException {
        ClienteBean cliente = new ClienteBean();
        cliente.setVchSource(Constants.SOURCE_CSV);
        cliente.setVchTipoDoc(fieldSet.readString(0));
        cliente.setVchNumDoc(fieldSet.readString(1));
        return cliente;
    }
}
