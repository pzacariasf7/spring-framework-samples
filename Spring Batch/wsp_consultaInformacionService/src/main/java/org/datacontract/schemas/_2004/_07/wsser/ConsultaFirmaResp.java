
package org.datacontract.schemas._2004._07.wsser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaFirmaResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaFirmaResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatoResultado" type="{http://schemas.datacontract.org/2004/07/WSSER}DatoResultado" minOccurs="0"/>
 *         &lt;element name="FirmaPersona" type="{http://schemas.datacontract.org/2004/07/WSSER}ImagenPersona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaFirmaResp", propOrder = {
    "datoResultado",
    "firmaPersona"
})
public class ConsultaFirmaResp {

    @XmlElementRef(name = "DatoResultado", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<DatoResultado> datoResultado;
    @XmlElementRef(name = "FirmaPersona", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<ImagenPersona> firmaPersona;

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

    /**
     * Gets the value of the firmaPersona property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImagenPersona }{@code >}
     *     
     */
    public JAXBElement<ImagenPersona> getFirmaPersona() {
        return firmaPersona;
    }

    /**
     * Sets the value of the firmaPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImagenPersona }{@code >}
     *     
     */
    public void setFirmaPersona(JAXBElement<ImagenPersona> value) {
        this.firmaPersona = value;
    }

}
