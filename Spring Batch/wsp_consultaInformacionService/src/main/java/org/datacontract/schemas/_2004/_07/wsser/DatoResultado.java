
package org.datacontract.schemas._2004._07.wsser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatoResultado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatoResultado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aplicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalleRegla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuentePlaneada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuenteReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultadoDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatoResultado", propOrder = {
    "aplicacion",
    "detalleRegla",
    "fuentePlaneada",
    "fuenteReal",
    "idOrden",
    "observacion",
    "resultado",
    "resultadoDescripcion"
})
public class DatoResultado {

    @XmlElementRef(name = "Aplicacion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aplicacion;
    @XmlElementRef(name = "DetalleRegla", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detalleRegla;
    @XmlElementRef(name = "FuentePlaneada", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fuentePlaneada;
    @XmlElementRef(name = "FuenteReal", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fuenteReal;
    @XmlElementRef(name = "IdOrden", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idOrden;
    @XmlElementRef(name = "Observacion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacion;
    @XmlElementRef(name = "Resultado", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultado;
    @XmlElementRef(name = "ResultadoDescripcion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultadoDescripcion;

    /**
     * Gets the value of the aplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplicacion() {
        return aplicacion;
    }

    /**
     * Sets the value of the aplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplicacion(JAXBElement<String> value) {
        this.aplicacion = value;
    }

    /**
     * Gets the value of the detalleRegla property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetalleRegla() {
        return detalleRegla;
    }

    /**
     * Sets the value of the detalleRegla property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetalleRegla(JAXBElement<String> value) {
        this.detalleRegla = value;
    }

    /**
     * Gets the value of the fuentePlaneada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuentePlaneada() {
        return fuentePlaneada;
    }

    /**
     * Sets the value of the fuentePlaneada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuentePlaneada(JAXBElement<String> value) {
        this.fuentePlaneada = value;
    }

    /**
     * Gets the value of the fuenteReal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuenteReal() {
        return fuenteReal;
    }

    /**
     * Sets the value of the fuenteReal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuenteReal(JAXBElement<String> value) {
        this.fuenteReal = value;
    }

    /**
     * Gets the value of the idOrden property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdOrden() {
        return idOrden;
    }

    /**
     * Sets the value of the idOrden property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdOrden(JAXBElement<String> value) {
        this.idOrden = value;
    }

    /**
     * Gets the value of the observacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacion() {
        return observacion;
    }

    /**
     * Sets the value of the observacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacion(JAXBElement<String> value) {
        this.observacion = value;
    }

    /**
     * Gets the value of the resultado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultado(JAXBElement<String> value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the resultadoDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultadoDescripcion() {
        return resultadoDescripcion;
    }

    /**
     * Sets the value of the resultadoDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultadoDescripcion(JAXBElement<String> value) {
        this.resultadoDescripcion = value;
    }

}
