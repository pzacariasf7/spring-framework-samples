
package org.datacontract.schemas._2004._07.wsser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatoConsulta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatoConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aplicativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatoConsulta", propOrder = {
    "aplicativo",
    "cantidadItem",
    "clave",
    "dni",
    "idOrden",
    "tipoPlan",
    "usuario"
})
public class DatoConsulta {

    @XmlElementRef(name = "Aplicativo", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aplicativo;
    @XmlElement(name = "CantidadItem")
    protected Long cantidadItem;
    @XmlElementRef(name = "Clave", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clave;
    @XmlElementRef(name = "Dni", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dni;
    @XmlElementRef(name = "IdOrden", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idOrden;
    @XmlElementRef(name = "TipoPlan", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPlan;
    @XmlElementRef(name = "Usuario", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuario;

    /**
     * Gets the value of the aplicativo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplicativo() {
        return aplicativo;
    }

    /**
     * Sets the value of the aplicativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplicativo(JAXBElement<String> value) {
        this.aplicativo = value;
    }

    /**
     * Gets the value of the cantidadItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCantidadItem() {
        return cantidadItem;
    }

    /**
     * Sets the value of the cantidadItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCantidadItem(Long value) {
        this.cantidadItem = value;
    }

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClave(JAXBElement<String> value) {
        this.clave = value;
    }

    /**
     * Gets the value of the dni property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDni() {
        return dni;
    }

    /**
     * Sets the value of the dni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDni(JAXBElement<String> value) {
        this.dni = value;
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
     * Gets the value of the tipoPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPlan() {
        return tipoPlan;
    }

    /**
     * Sets the value of the tipoPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPlan(JAXBElement<String> value) {
        this.tipoPlan = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuario(JAXBElement<String> value) {
        this.usuario = value;
    }

}
