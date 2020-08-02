package pe.com.entel.appfilemerger.AppFileMerger.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("file:${ev.filemerger.dir.cfg}appfilemerger.properties")
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
}
