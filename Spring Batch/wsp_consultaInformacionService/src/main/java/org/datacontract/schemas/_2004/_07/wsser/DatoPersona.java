
package org.datacontract.schemas._2004._07.wsser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatoPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatoPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnioEstudio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaducidadCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaducidadDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoDeptoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoDeptoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoDistDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoDistNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoLocalidadDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoLocalidadNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoProvDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoProvNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConstanciaVotacionCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConstanciaVotacionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartamentoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartamentoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistritoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistritoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoCivilCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoCivilDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradoInstruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrupoVotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalidadDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombrePadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocSustentarioIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroLibro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvinciaDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvinciaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restricciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestriccionesDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SexoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SexoDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocSustentarioIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UbigeoVotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatoPersona", propOrder = {
    "anioEstudio",
    "apellidoMaterno",
    "apellidoPaterno",
    "caducidadCodigo",
    "caducidadDescripcion",
    "codigoUbigeoDeptoDomicilio",
    "codigoUbigeoDeptoNacimiento",
    "codigoUbigeoDistDomicilio",
    "codigoUbigeoDistNacimiento",
    "codigoUbigeoLocalidadDomicilio",
    "codigoUbigeoLocalidadNacimiento",
    "codigoUbigeoProvDomicilio",
    "codigoUbigeoProvNacimiento",
    "constanciaVotacionCodigo",
    "constanciaVotacionDesc",
    "departamentoDomicilio",
    "departamentoNacimiento",
    "direccionDomicilio",
    "distritoDomicilio",
    "distritoNacimiento",
    "dni",
    "estadoCivilCodigo",
    "estadoCivilDescripcion",
    "estatura",
    "fechaExpedicion",
    "fechaInscripcion",
    "fechaNacimiento",
    "gradoInstruccion",
    "grupoVotacion",
    "localidad",
    "localidadDomicilio",
    "nombreMadre",
    "nombrePadre",
    "nombres",
    "numeroDocSustentarioIdentidad",
    "numeroLibro",
    "provinciaDomicilio",
    "provinciaNacimiento",
    "restricciones",
    "restriccionesDesc",
    "sexoCodigo",
    "sexoDescripcion",
    "tipoDocSustentarioIdentidad",
    "ubigeoVotacion"
})
public class DatoPersona {

    @XmlElementRef(name = "AnioEstudio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> anioEstudio;
    @XmlElementRef(name = "ApellidoMaterno", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellidoMaterno;
    @XmlElementRef(name = "ApellidoPaterno", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellidoPaterno;
    @XmlElementRef(name = "CaducidadCodigo", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caducidadCodigo;
    @XmlElementRef(name = "CaducidadDescripcion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caducidadDescripcion;
    @XmlElementRef(name = "CodigoUbigeoDeptoDomicilio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoUbigeoDeptoDomicilio;
    @XmlElementRef(name = "CodigoUbigeoDeptoNacimiento", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoUbigeoDeptoNacimiento;
    @XmlElementRef(name = "CodigoUbigeoDistDomicilio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoUbigeoDistDomicilio;
    @XmlElementRef(name = "CodigoUbigeoDistNacimiento", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoUbigeoDistNacimiento;
    @XmlElementRef(name = "CodigoUbigeoLocalidadDomicilio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoUbigeoLocalidadDomicilio;
    @XmlElementRef(name = "CodigoUbigeoLocalidadNacimiento", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoUbigeoLocalidadNacimiento;
    @XmlElementRef(name = "CodigoUbigeoProvDomicilio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoUbigeoProvDomicilio;
    @XmlElementRef(name = "CodigoUbigeoProvNacimiento", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoUbigeoProvNacimiento;
    @XmlElementRef(name = "ConstanciaVotacionCodigo", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> constanciaVotacionCodigo;
    @XmlElementRef(name = "ConstanciaVotacionDesc", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> constanciaVotacionDesc;
    @XmlElementRef(name = "DepartamentoDomicilio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departamentoDomicilio;
    @XmlElementRef(name = "DepartamentoNacimiento", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departamentoNacimiento;
    @XmlElementRef(name = "DireccionDomicilio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionDomicilio;
    @XmlElementRef(name = "DistritoDomicilio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distritoDomicilio;
    @XmlElementRef(name = "DistritoNacimiento", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distritoNacimiento;
    @XmlElementRef(name = "Dni", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dni;
    @XmlElementRef(name = "EstadoCivilCodigo", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoCivilCodigo;
    @XmlElementRef(name = "EstadoCivilDescripcion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoCivilDescripcion;
    @XmlElementRef(name = "Estatura", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estatura;
    @XmlElementRef(name = "FechaExpedicion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaExpedicion;
    @XmlElementRef(name = "FechaInscripcion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaInscripcion;
    @XmlElementRef(name = "FechaNacimiento", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaNacimiento;
    @XmlElementRef(name = "GradoInstruccion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gradoInstruccion;
    @XmlElementRef(name = "GrupoVotacion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grupoVotacion;
    @XmlElementRef(name = "Localidad", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localidad;
    @XmlElementRef(name = "LocalidadDomicilio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localidadDomicilio;
    @XmlElementRef(name = "NombreMadre", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreMadre;
    @XmlElementRef(name = "NombrePadre", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePadre;
    @XmlElementRef(name = "Nombres", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombres;
    @XmlElementRef(name = "NumeroDocSustentarioIdentidad", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDocSustentarioIdentidad;
    @XmlElementRef(name = "NumeroLibro", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroLibro;
    @XmlElementRef(name = "ProvinciaDomicilio", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provinciaDomicilio;
    @XmlElementRef(name = "ProvinciaNacimiento", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provinciaNacimiento;
    @XmlElementRef(name = "Restricciones", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> restricciones;
    @XmlElementRef(name = "RestriccionesDesc", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> restriccionesDesc;
    @XmlElementRef(name = "SexoCodigo", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sexoCodigo;
    @XmlElementRef(name = "SexoDescripcion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sexoDescripcion;
    @XmlElementRef(name = "TipoDocSustentarioIdentidad", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocSustentarioIdentidad;
    @XmlElementRef(name = "UbigeoVotacion", namespace = "http://schemas.datacontract.org/2004/07/WSSER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ubigeoVotacion;

    /**
     * Gets the value of the anioEstudio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnioEstudio() {
        return anioEstudio;
    }

    /**
     * Sets the value of the anioEstudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnioEstudio(JAXBElement<String> value) {
        this.anioEstudio = value;
    }

    /**
     * Gets the value of the apellidoMaterno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Sets the value of the apellidoMaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellidoMaterno(JAXBElement<String> value) {
        this.apellidoMaterno = value;
    }

    /**
     * Gets the value of the apellidoPaterno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Sets the value of the apellidoPaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellidoPaterno(JAXBElement<String> value) {
        this.apellidoPaterno = value;
    }

    /**
     * Gets the value of the caducidadCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaducidadCodigo() {
        return caducidadCodigo;
    }

    /**
     * Sets the value of the caducidadCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaducidadCodigo(JAXBElement<String> value) {
        this.caducidadCodigo = value;
    }

    /**
     * Gets the value of the caducidadDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaducidadDescripcion() {
        return caducidadDescripcion;
    }

    /**
     * Sets the value of the caducidadDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaducidadDescripcion(JAXBElement<String> value) {
        this.caducidadDescripcion = value;
    }

    /**
     * Gets the value of the codigoUbigeoDeptoDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoUbigeoDeptoDomicilio() {
        return codigoUbigeoDeptoDomicilio;
    }

    /**
     * Sets the value of the codigoUbigeoDeptoDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoUbigeoDeptoDomicilio(JAXBElement<String> value) {
        this.codigoUbigeoDeptoDomicilio = value;
    }

    /**
     * Gets the value of the codigoUbigeoDeptoNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoUbigeoDeptoNacimiento() {
        return codigoUbigeoDeptoNacimiento;
    }

    /**
     * Sets the value of the codigoUbigeoDeptoNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoUbigeoDeptoNacimiento(JAXBElement<String> value) {
        this.codigoUbigeoDeptoNacimiento = value;
    }

    /**
     * Gets the value of the codigoUbigeoDistDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoUbigeoDistDomicilio() {
        return codigoUbigeoDistDomicilio;
    }

    /**
     * Sets the value of the codigoUbigeoDistDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoUbigeoDistDomicilio(JAXBElement<String> value) {
        this.codigoUbigeoDistDomicilio = value;
    }

    /**
     * Gets the value of the codigoUbigeoDistNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoUbigeoDistNacimiento() {
        return codigoUbigeoDistNacimiento;
    }

    /**
     * Sets the value of the codigoUbigeoDistNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoUbigeoDistNacimiento(JAXBElement<String> value) {
        this.codigoUbigeoDistNacimiento = value;
    }

    /**
     * Gets the value of the codigoUbigeoLocalidadDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoUbigeoLocalidadDomicilio() {
        return codigoUbigeoLocalidadDomicilio;
    }

    /**
     * Sets the value of the codigoUbigeoLocalidadDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoUbigeoLocalidadDomicilio(JAXBElement<String> value) {
        this.codigoUbigeoLocalidadDomicilio = value;
    }

    /**
     * Gets the value of the codigoUbigeoLocalidadNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoUbigeoLocalidadNacimiento() {
        return codigoUbigeoLocalidadNacimiento;
    }

    /**
     * Sets the value of the codigoUbigeoLocalidadNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoUbigeoLocalidadNacimiento(JAXBElement<String> value) {
        this.codigoUbigeoLocalidadNacimiento = value;
    }

    /**
     * Gets the value of the codigoUbigeoProvDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoUbigeoProvDomicilio() {
        return codigoUbigeoProvDomicilio;
    }

    /**
     * Sets the value of the codigoUbigeoProvDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoUbigeoProvDomicilio(JAXBElement<String> value) {
        this.codigoUbigeoProvDomicilio = value;
    }

    /**
     * Gets the value of the codigoUbigeoProvNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoUbigeoProvNacimiento() {
        return codigoUbigeoProvNacimiento;
    }

    /**
     * Sets the value of the codigoUbigeoProvNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoUbigeoProvNacimiento(JAXBElement<String> value) {
        this.codigoUbigeoProvNacimiento = value;
    }

    /**
     * Gets the value of the constanciaVotacionCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConstanciaVotacionCodigo() {
        return constanciaVotacionCodigo;
    }

    /**
     * Sets the value of the constanciaVotacionCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConstanciaVotacionCodigo(JAXBElement<String> value) {
        this.constanciaVotacionCodigo = value;
    }

    /**
     * Gets the value of the constanciaVotacionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConstanciaVotacionDesc() {
        return constanciaVotacionDesc;
    }

    /**
     * Sets the value of the constanciaVotacionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConstanciaVotacionDesc(JAXBElement<String> value) {
        this.constanciaVotacionDesc = value;
    }

    /**
     * Gets the value of the departamentoDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartamentoDomicilio() {
        return departamentoDomicilio;
    }

    /**
     * Sets the value of the departamentoDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartamentoDomicilio(JAXBElement<String> value) {
        this.departamentoDomicilio = value;
    }

    /**
     * Gets the value of the departamentoNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartamentoNacimiento() {
        return departamentoNacimiento;
    }

    /**
     * Sets the value of the departamentoNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartamentoNacimiento(JAXBElement<String> value) {
        this.departamentoNacimiento = value;
    }

    /**
     * Gets the value of the direccionDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionDomicilio() {
        return direccionDomicilio;
    }

    /**
     * Sets the value of the direccionDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionDomicilio(JAXBElement<String> value) {
        this.direccionDomicilio = value;
    }

    /**
     * Gets the value of the distritoDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistritoDomicilio() {
        return distritoDomicilio;
    }

    /**
     * Sets the value of the distritoDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistritoDomicilio(JAXBElement<String> value) {
        this.distritoDomicilio = value;
    }

    /**
     * Gets the value of the distritoNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistritoNacimiento() {
        return distritoNacimiento;
    }

    /**
     * Sets the value of the distritoNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistritoNacimiento(JAXBElement<String> value) {
        this.distritoNacimiento = value;
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
     * Gets the value of the estadoCivilCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoCivilCodigo() {
        return estadoCivilCodigo;
    }

    /**
     * Sets the value of the estadoCivilCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoCivilCodigo(JAXBElement<String> value) {
        this.estadoCivilCodigo = value;
    }

    /**
     * Gets the value of the estadoCivilDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoCivilDescripcion() {
        return estadoCivilDescripcion;
    }

    /**
     * Sets the value of the estadoCivilDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoCivilDescripcion(JAXBElement<String> value) {
        this.estadoCivilDescripcion = value;
    }

    /**
     * Gets the value of the estatura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstatura() {
        return estatura;
    }

    /**
     * Sets the value of the estatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstatura(JAXBElement<String> value) {
        this.estatura = value;
    }

    /**
     * Gets the value of the fechaExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Sets the value of the fechaExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaExpedicion(JAXBElement<String> value) {
        this.fechaExpedicion = value;
    }

    /**
     * Gets the value of the fechaInscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Sets the value of the fechaInscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaInscripcion(JAXBElement<String> value) {
        this.fechaInscripcion = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaNacimiento(JAXBElement<String> value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the gradoInstruccion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGradoInstruccion() {
        return gradoInstruccion;
    }

    /**
     * Sets the value of the gradoInstruccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGradoInstruccion(JAXBElement<String> value) {
        this.gradoInstruccion = value;
    }

    /**
     * Gets the value of the grupoVotacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrupoVotacion() {
        return grupoVotacion;
    }

    /**
     * Sets the value of the grupoVotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrupoVotacion(JAXBElement<String> value) {
        this.grupoVotacion = value;
    }

    /**
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalidad() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalidad(JAXBElement<String> value) {
        this.localidad = value;
    }

    /**
     * Gets the value of the localidadDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalidadDomicilio() {
        return localidadDomicilio;
    }

    /**
     * Sets the value of the localidadDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalidadDomicilio(JAXBElement<String> value) {
        this.localidadDomicilio = value;
    }

    /**
     * Gets the value of the nombreMadre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreMadre() {
        return nombreMadre;
    }

    /**
     * Sets the value of the nombreMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreMadre(JAXBElement<String> value) {
        this.nombreMadre = value;
    }

    /**
     * Gets the value of the nombrePadre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePadre() {
        return nombrePadre;
    }

    /**
     * Sets the value of the nombrePadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePadre(JAXBElement<String> value) {
        this.nombrePadre = value;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombres() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombres(JAXBElement<String> value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the numeroDocSustentarioIdentidad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDocSustentarioIdentidad() {
        return numeroDocSustentarioIdentidad;
    }

    /**
     * Sets the value of the numeroDocSustentarioIdentidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDocSustentarioIdentidad(JAXBElement<String> value) {
        this.numeroDocSustentarioIdentidad = value;
    }

    /**
     * Gets the value of the numeroLibro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroLibro() {
        return numeroLibro;
    }

    /**
     * Sets the value of the numeroLibro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroLibro(JAXBElement<String> value) {
        this.numeroLibro = value;
    }

    /**
     * Gets the value of the provinciaDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvinciaDomicilio() {
        return provinciaDomicilio;
    }

    /**
     * Sets the value of the provinciaDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvinciaDomicilio(JAXBElement<String> value) {
        this.provinciaDomicilio = value;
    }

    /**
     * Gets the value of the provinciaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvinciaNacimiento() {
        return provinciaNacimiento;
    }

    /**
     * Sets the value of the provinciaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvinciaNacimiento(JAXBElement<String> value) {
        this.provinciaNacimiento = value;
    }

    /**
     * Gets the value of the restricciones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestricciones() {
        return restricciones;
    }

    /**
     * Sets the value of the restricciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestricciones(JAXBElement<String> value) {
        this.restricciones = value;
    }

    /**
     * Gets the value of the restriccionesDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestriccionesDesc() {
        return restriccionesDesc;
    }

    /**
     * Sets the value of the restriccionesDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestriccionesDesc(JAXBElement<String> value) {
        this.restriccionesDesc = value;
    }

    /**
     * Gets the value of the sexoCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSexoCodigo() {
        return sexoCodigo;
    }

    /**
     * Sets the value of the sexoCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSexoCodigo(JAXBElement<String> value) {
        this.sexoCodigo = value;
    }

    /**
     * Gets the value of the sexoDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSexoDescripcion() {
        return sexoDescripcion;
    }

    /**
     * Sets the value of the sexoDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSexoDescripcion(JAXBElement<String> value) {
        this.sexoDescripcion = value;
    }

    /**
     * Gets the value of the tipoDocSustentarioIdentidad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocSustentarioIdentidad() {
        return tipoDocSustentarioIdentidad;
    }

    /**
     * Sets the value of the tipoDocSustentarioIdentidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocSustentarioIdentidad(JAXBElement<String> value) {
        this.tipoDocSustentarioIdentidad = value;
    }

    /**
     * Gets the value of the ubigeoVotacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUbigeoVotacion() {
        return ubigeoVotacion;
    }

    /**
     * Sets the value of the ubigeoVotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUbigeoVotacion(JAXBElement<String> value) {
        this.ubigeoVotacion = value;
    }

}
