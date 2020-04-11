
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wsser.ConsultaFirmaResp;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarFirmaResult" type="{http://schemas.datacontract.org/2004/07/WSSER}ConsultaFirmaResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarFirmaResult"
})
@XmlRootElement(name = "consultarFirmaResponse")
public class ConsultarFirmaResponse {

    @XmlElementRef(name = "consultarFirmaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsultaFirmaResp> consultarFirmaResult;

    /**
     * Gets the value of the consultarFirmaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsultaFirmaResp }{@code >}
     *     
     */
    public JAXBElement<ConsultaFirmaResp> getConsultarFirmaResult() {
        return consultarFirmaResult;
    }

    /**
     * Sets the value of the consultarFirmaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsultaFirmaResp }{@code >}
     *     
     */
    public void setConsultarFirmaResult(JAXBElement<ConsultaFirmaResp> value) {
        this.consultarFirmaResult = value;
    }

}
