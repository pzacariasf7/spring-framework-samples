package pe.com.entel.regNomBlancoPIAS.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.com.entel.regNomBlancoPIAS.bean.ClienteBean;
import pe.com.entel.regNomBlancoPIAS.util.Constants;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteRowMapper implements RowMapper<ClienteBean> {

    public ClienteBean mapRow(ResultSet rs, int rowNum) throws SQLException {
        ClienteBean cliente = new ClienteBean();
        cliente.setVchSource(Constants.SOURCE_DB);
        cliente.setVchTipoDoc(rs.getString("vchTipoDoc"));
        cliente.setVchNumDoc(rs.getString("vchNumDoc"));
        return cliente;
    }
}
