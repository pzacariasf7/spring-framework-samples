package pe.com.entel.appfilemerger.AppFileMerger.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("${ev.filemerger.properties}")
public class Properties {

    @Value("${filemerger.operators.code}")
    public String OPERATORS;

    @Value("${filemerger.file.separator}")
    public String FILE_SEPARATOR;

    @Value("${filemerger.file.extension}")
    public String FILE_EXTENSION;

    @Value("${filemerger.filename.length}")
    public Integer FILENAME_LENGTH;

    @Value("${filemerger.folder.leg}")
    public String FOLDER_LEG;

    @Value("${filemerger.folder.tde}")
    public String FOLDER_TDE;

    @Value("${filemerger.folder.final}")
    public String FOLDER_FINAL;

    @Value("${filemerger.filetype.cl}")
    public String FILETYPE_CL;

    @Value("${filemerger.file.footer}")
    public String FILE_FOOTER;

    @Value("${filemerger.config.leg}")
    public String CONFIG_LEG;

    @Value("${filemerger.config.tde}")
    public String CONFIG_TDE;

    @Value("${filemerger.field.separator}")
    public String FIELDS_SEPARATOR;

    @Value("${filemerger.field.phonenumber.numposition}")
    public Integer PHONENUMBER_NUMPOSITION;

    @Value("${filemerger.field.codtrx.numposition}")
    public Integer CODTRX_NUMPOSITION;

    @Value("${filemerger.field.flagApplied.numposition}")
    public Integer FLAGAPPLIED_NUMPOSITION;

    @Value("${filemerger.field.flagApplied.yes}")
    public String FLAGAPPLIED_YES;

    @Value("${filemerger.field.flagApplied.no}")
    public String FLAGAPPLIED_NO;

    @Value("${filemerger.header.dateTime.numposition}")
    public Integer HEADER_DATETIME_NUMPOSITION;

    @Value("${filemerger.header.registrynum.numposition}")
    public Integer HEADER_REGISTRYNUM_NUMPOSITION;

    @Value("${filemerger.header.appliednum.numposition}")
    public Integer HEADER_APPLIEDNUM_NUMPOSITION;

    @Value("${filemerger.header.registrynum.length}")
    public Integer HEADER_REGISTRYNUM_LENGTH;

    @Value("${filemerger.header.appliednum.length}")
    public Integer HEADER_APPLIEDNUM_LENGTH;

}
