
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wsser.ConsultaConsolidadoResp;
import org.datacontract.schemas._2004._07.wsser.ConsultaDatoResp;
import org.datacontract.schemas._2004._07.wsser.ConsultaFirmaResp;
import org.datacontract.schemas._2004._07.wsser.ConsultaFotoResp;
import org.datacontract.schemas._2004._07.wsser.ConsultaRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarDatosReq_QNAME = new QName("http://tempuri.org/", "req");
    private final static QName _ConsultarConsolidadoResponseConsultarConsolidadoResult_QNAME = new QName("http://tempuri.org/", "consultarConsolidadoResult");
    private final static QName _ConsultarFotoResponseConsultarFotoResult_QNAME = new QName("http://tempuri.org/", "consultarFotoResult");
    private final static QName _ConsultarFirmaResponseConsultarFirmaResult_QNAME = new QName("http://tempuri.org/", "consultarFirmaResult");
    private final static QName _ConsultarDatosResponseConsultarDatosResult_QNAME = new QName("http://tempuri.org/", "consultarDatosResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarDatosResponse }
     * 
     */
    public ConsultarDatosResponse createConsultarDatosResponse() {
        return new ConsultarDatosResponse();
    }

    /**
     * Create an instance of {@link ConsultarFoto }
     * 
     */
    public ConsultarFoto createConsultarFoto() {
        return new ConsultarFoto();
    }

    /**
     * Create an instance of {@link ConsultarFirmaResponse }
     * 
     */
    public ConsultarFirmaResponse createConsultarFirmaResponse() {
        return new ConsultarFirmaResponse();
    }

    /**
     * Create an instance of {@link ConsultarConsolidado }
     * 
     */
    public ConsultarConsolidado createConsultarConsolidado() {
        return new ConsultarConsolidado();
    }

    /**
     * Create an instance of {@link ConsultarConsolidadoResponse }
     * 
     */
    public ConsultarConsolidadoResponse createConsultarConsolidadoResponse() {
        return new ConsultarConsolidadoResponse();
    }

    /**
     * Create an instance of {@link ConsultarFotoResponse }
     * 
     */
    public ConsultarFotoResponse createConsultarFotoResponse() {
        return new ConsultarFotoResponse();
    }

    /**
     * Create an instance of {@link ConsultarFirma }
     * 
     */
    public ConsultarFirma createConsultarFirma() {
        return new ConsultarFirma();
    }

    /**
     * Create an instance of {@link ConsultarDatos }
     * 
     */
    public ConsultarDatos createConsultarDatos() {
        return new ConsultarDatos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = ConsultarDatos.class)
    public JAXBElement<ConsultaRequest> createConsultarDatosReq(ConsultaRequest value) {
        return new JAXBElement<ConsultaRequest>(_ConsultarDatosReq_QNAME, ConsultaRequest.class, ConsultarDatos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = ConsultarFirma.class)
    public JAXBElement<ConsultaRequest> createConsultarFirmaReq(ConsultaRequest value) {
        return new JAXBElement<ConsultaRequest>(_ConsultarDatosReq_QNAME, ConsultaRequest.class, ConsultarFirma.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaConsolidadoResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultarConsolidadoResult", scope = ConsultarConsolidadoResponse.class)
    public JAXBElement<ConsultaConsolidadoResp> createConsultarConsolidadoResponseConsultarConsolidadoResult(ConsultaConsolidadoResp value) {
        return new JAXBElement<ConsultaConsolidadoResp>(_ConsultarConsolidadoResponseConsultarConsolidadoResult_QNAME, ConsultaConsolidadoResp.class, ConsultarConsolidadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = ConsultarFoto.class)
    public JAXBElement<ConsultaRequest> createConsultarFotoReq(ConsultaRequest value) {
        return new JAXBElement<ConsultaRequest>(_ConsultarDatosReq_QNAME, ConsultaRequest.class, ConsultarFoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFotoResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultarFotoResult", scope = ConsultarFotoResponse.class)
    public JAXBElement<ConsultaFotoResp> createConsultarFotoResponseConsultarFotoResult(ConsultaFotoResp value) {
        return new JAXBElement<ConsultaFotoResp>(_ConsultarFotoResponseConsultarFotoResult_QNAME, ConsultaFotoResp.class, ConsultarFotoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFirmaResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultarFirmaResult", scope = ConsultarFirmaResponse.class)
    public JAXBElement<ConsultaFirmaResp> createConsultarFirmaResponseConsultarFirmaResult(ConsultaFirmaResp value) {
        return new JAXBElement<ConsultaFirmaResp>(_ConsultarFirmaResponseConsultarFirmaResult_QNAME, ConsultaFirmaResp.class, ConsultarFirmaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaDatoResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultarDatosResult", scope = ConsultarDatosResponse.class)
    public JAXBElement<ConsultaDatoResp> createConsultarDatosResponseConsultarDatosResult(ConsultaDatoResp value) {
        return new JAXBElement<ConsultaDatoResp>(_ConsultarDatosResponseConsultarDatosResult_QNAME, ConsultaDatoResp.class, ConsultarDatosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = ConsultarConsolidado.class)
    public JAXBElement<ConsultaRequest> createConsultarConsolidadoReq(ConsultaRequest value) {
        return new JAXBElement<ConsultaRequest>(_ConsultarDatosReq_QNAME, ConsultaRequest.class, ConsultarConsolidado.class, value);
    }

}
