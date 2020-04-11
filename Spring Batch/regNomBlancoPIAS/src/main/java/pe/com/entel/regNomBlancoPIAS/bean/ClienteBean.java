package pe.com.entel.regNomBlancoPIAS.bean;

import pe.com.entel.regNomBlancoPIAS.util.GenericBean;

public class ClienteBean extends GenericBean{
    private Integer numIdentificador;
    private Long numControlId;
    private String vchApplication;
    private String vchSource;
    private String vchTipoDoc;
    private String vchNumDoc;

    private Integer numEstado;
    private String vchApi;
    private String vchError;

    private String vchName;
    private String vchFirstname;
    private String vchLastname;
    private String vchLastname2;

    public ClienteBean(){

    }

    public Integer getNumIdentificador() {
        return numIdentificador;
    }

    public void setNumIdentificador(Integer numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public Long getNumControlId() {
        return numControlId;
    }

    public void setNumControlId(Long numControlId) {
        this.numControlId = numControlId;
    }

    public String getVchApplication() {
        return vchApplication;
    }

    public void setVchApplication(String vchApplication) {
        this.vchApplication = vchApplication;
    }

    public String getVchSource() {
        return vchSource;
    }

    public void setVchSource(String vchSource) {
        this.vchSource = vchSource;
    }

    public String getVchTipoDoc() {
        return vchTipoDoc;
    }

    public void setVchTipoDoc(String vchTipoDoc) {
        this.vchTipoDoc = vchTipoDoc;
    }

    public String getVchNumDoc() {
        return vchNumDoc;
    }

    public void setVchNumDoc(String vchNumDoc) {
        this.vchNumDoc = vchNumDoc;
    }

    public Integer getNumEstado() {
        return numEstado;
    }

    public void setNumEstado(Integer numEstado) {
        this.numEstado = numEstado;
    }

    public String getVchApi() {
        return vchApi;
    }

    public void setVchApi(String vchApi) {
        this.vchApi = vchApi;
    }

    public String getVchError() {
        return vchError;
    }

    public void setVchError(String vchError) {
        this.vchError = vchError;
    }

    public String getVchName() {
        return vchName;
    }

    public void setVchName(String vchName) {
        this.vchName = vchName;
    }

    public String getVchFirstname() {
        return vchFirstname;
    }

    public void setVchFirstname(String vchFirstname) {
        this.vchFirstname = vchFirstname;
    }

    public String getVchLastname() {
        return vchLastname;
    }

    public void setVchLastname(String vchLastname) {
        this.vchLastname = vchLastname;
    }

    public String getVchLastname2() {
        return vchLastname2;
    }

    public void setVchLastname2(String vchLastname2) {
        this.vchLastname2 = vchLastname2;
    }

    @Override
    public String toString() {
        return "ClienteBean{" +
                "numIdentificador=" + numIdentificador +
                ", numControlId=" + numControlId +
                ", vchApplication='" + vchApplication + '\'' +
                ", vchSource='" + vchSource + '\'' +
                ", vchTipoDoc='" + vchTipoDoc + '\'' +
                ", vchNumDoc='" + vchNumDoc + '\'' +
                ", numEstado=" + numEstado +
                ", vchApi='" + vchApi + '\'' +
                ", vchError='" + vchError + '\'' +
                ", vchName='" + vchName + '\'' +
                ", vchFirstname='" + vchFirstname + '\'' +
                ", vchLastname='" + vchLastname + '\'' +
                ", vchLastname2='" + vchLastname2 + '\'' +
                '}';
    }
}
