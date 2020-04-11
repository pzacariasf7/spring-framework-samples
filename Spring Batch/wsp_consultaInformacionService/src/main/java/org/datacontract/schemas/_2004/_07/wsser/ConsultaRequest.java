
package org.datacontract.schemas._2004._07.wsser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatoConsulta" type="{http://schemas.datacontract.org/2004/07/WSSER}DatoConsulta" minOccurs="0"/>
 *         &lt;element name="VariableRegla" type="{http://schemas.datacontract.org/2004/07/WSSER}ArrayOfVariablesRegla" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaRequest", propOrder = {
    "datoConsulta",
    "variableRegla"
})
public class ConsultaRequest {

    @XmlElementRef(name = "DatoConsulta", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<DatoConsulta> datoConsulta;
    @XmlElementRef(name = "VariableRegla", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVariablesRegla> variableRegla;

    /**
     * Gets the value of the datoConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatoConsulta }{@code >}
     *     
     */
    public JAXBElement<DatoConsulta> getDatoConsulta() {
        return datoConsulta;
    }

    /**
     * Sets the value of the datoConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatoConsulta }{@code >}
     *     
     */
    public void setDatoConsulta(JAXBElement<DatoConsulta> value) {
        this.datoConsulta = value;
    }

    /**
     * Gets the value of the variableRegla property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVariablesRegla }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVariablesRegla> getVariableRegla() {
        return variableRegla;
    }

    /**
     * Sets the value of the variableRegla property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVariablesRegla }{@code >}
     *     
     */
    public void setVariableRegla(JAXBElement<ArrayOfVariablesRegla> value) {
        this.variableRegla = value;
    }

}
