
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wsser.ConsultaFotoResp;


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
 *         &lt;element name="consultarFotoResult" type="{http://schemas.datacontract.org/2004/07/WSSER}ConsultaFotoResp" minOccurs="0"/>
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
    "consultarFotoResult"
})
@XmlRootElement(name = "consultarFotoResponse")
public class ConsultarFotoResponse {

    @XmlElementRef(name = "consultarFotoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsultaFotoResp> consultarFotoResult;

    /**
     * Gets the value of the consultarFotoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsultaFotoResp }{@code >}
     *     
     */
    public JAXBElement<ConsultaFotoResp> getConsultarFotoResult() {
        return consultarFotoResult;
    }

    /**
     * Sets the value of the consultarFotoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsultaFotoResp }{@code >}
     *     
     */
    public void setConsultarFotoResult(JAXBElement<ConsultaFotoResp> value) {
        this.consultarFotoResult = value;
    }

}
