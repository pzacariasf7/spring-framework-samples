
package org.datacontract.schemas._2004._07.wsser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaDatoResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaDatoResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatoPersona" type="{http://schemas.datacontract.org/2004/07/WSSER}DatoPersona" minOccurs="0"/>
 *         &lt;element name="DatoResultado" type="{http://schemas.datacontract.org/2004/07/WSSER}DatoResultado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaDatoResp", propOrder = {
    "datoPersona",
    "datoResultado"
})
public class ConsultaDatoResp {

    @XmlElementRef(name = "DatoPersona", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<DatoPersona> datoPersona;
    @XmlElementRef(name = "DatoResultado", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<DatoResultado> datoResultado;

    /**
     * Gets the value of the datoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatoPersona }{@code >}
     *     
     */
    public JAXBElement<DatoPersona> getDatoPersona() {
        return datoPersona;
    }

    /**
     * Sets the value of the datoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatoPersona }{@code >}
     *     
     */
    public void setDatoPersona(JAXBElement<DatoPersona> value) {
        this.datoPersona = value;
    }

    /**
     * Gets the value of the datoResultado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatoResultado }{@code >}
     *     
     */
    public JAXBElement<DatoResultado> getDatoResultado() {
        return datoResultado;
    }

    /**
     * Sets the value of the datoResultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatoResultado }{@code >}
     *     
     */
    public void setDatoResultado(JAXBElement<DatoResultado> value) {
        this.datoResultado = value;
    }

}
