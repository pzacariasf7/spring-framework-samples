package pe.com.entel.appfilemerger.AppFileMerger.repository.impl;

import oracle.jdbc.OracleTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Repository;
import pe.com.entel.appfilemerger.AppFileMerger.repository.GetCodTrxCLSP;

import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class GetCodTrxCLSPImpl extends StoredProcedure implements GetCodTrxCLSP {

    private static Logger logger = LoggerFactory.getLogger(GetCodTrxCLSPImpl.class);

    protected static final String ACUR_COD_TRX = "ACUR_COD_TRX";
    protected static final String AVCH_MESSAGE = "AVCH_MESSAGE";

    public GetCodTrxCLSPImpl(JdbcTemplate jdbcTemplate, @Value("${filemerger.sp.getcodtrxcl.spname}") String spName) {
        super(jdbcTemplate, spName);
        logger.info("[GetCodTrxCLSPImpl] spName="+spName);
        declareParameter(new SqlOutParameter(ACUR_COD_TRX, OracleTypes.CURSOR));
        declareParameter(new SqlOutParameter(AVCH_MESSAGE, Types.VARCHAR));
        compile();
    }

    @Override
    public Map<String, Object> execute() throws Exception {
        Map<String, Object> mapOutput = new HashMap<String, Object>();
        try {
            Map<String, Object> output = super.execute();

            String message = (String) output.get(AVCH_MESSAGE);
            if (message != null) {
                mapOutput.put("error", message);
                return mapOutput;
            }
            mapOutput.put("listConfig", (List<Map<String, String>>) output.get(ACUR_COD_TRX));
            return mapOutput;
        } catch (Exception ex) {
            throw ex;
        }
    }
}
