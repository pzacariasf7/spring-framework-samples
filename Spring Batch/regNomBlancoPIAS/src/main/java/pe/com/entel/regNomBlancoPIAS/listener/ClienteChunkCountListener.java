package pe.com.entel.regNomBlancoPIAS.listener;

import org.apache.log4j.Logger;
import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

import java.text.MessageFormat;

public class ClienteChunkCountListener implements ChunkListener {

    Logger logger = Logger.getLogger(ClienteChunkCountListener.class);
    private MessageFormat fmtP = new MessageFormat("{0} lineas procesadas");
    private MessageFormat fmtS = new MessageFormat("{0} lineas omitidas");
    private MessageFormat fmtR = new MessageFormat("{0} lineas erradas");
    private int loggingInterval = 1000;

    public void beforeChunk(ChunkContext chunkContext) {
    }

    public void afterChunk(ChunkContext chunkContext) {
        int countP = chunkContext.getStepContext().getStepExecution().getReadCount();
        int countS = chunkContext.getStepContext().getStepExecution().getReadSkipCount();
        int countR = chunkContext.getStepContext().getStepExecution().getRollbackCount();
        if (countP > 0 && countP % loggingInterval == 0) {
            logger.info( fmtP.format(new Object[] {new Integer(countP) })) ;
        }
        if (countS > 0 && countS % loggingInterval == 0) {
            logger.info( fmtS.format(new Object[] {new Integer(countS) })) ;
        }
        if (countR > 0 && countR % loggingInterval == 0) {
            logger.info( fmtR.format(new Object[] {new Integer(countR) })) ;
        }
    }

    public void afterChunkError(ChunkContext chunkContext) {
    }
}
