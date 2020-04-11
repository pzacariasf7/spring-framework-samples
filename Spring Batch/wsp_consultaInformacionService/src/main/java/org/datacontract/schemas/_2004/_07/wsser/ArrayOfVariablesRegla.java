
package org.datacontract.schemas._2004._07.wsser;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVariablesRegla complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVariablesRegla">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariablesRegla" type="{http://schemas.datacontract.org/2004/07/WSSER}VariablesRegla" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVariablesRegla", propOrder = {
    "variablesRegla"
})
public class ArrayOfVariablesRegla {

    @XmlElement(name = "VariablesRegla", nillable = true)
    protected List<VariablesRegla> variablesRegla;

    /**
     * Gets the value of the variablesRegla property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variablesRegla property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariablesRegla().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariablesRegla }
     * 
     * 
     */
    public List<VariablesRegla> getVariablesRegla() {
        if (variablesRegla == null) {
            variablesRegla = new ArrayList<VariablesRegla>();
        }
        return this.variablesRegla;
    }

}
