
package jaxws.smsc.subscriber;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for balanceSetPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="balanceSetPort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balanceIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="balanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balancePortSet" type="{http://wsi.mc.nuevatel.com/}balancePort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balanceSetPort", propOrder = {
    "balanceIndex",
    "balanceName",
    "balancePortSet"
})
public class BalanceSetPort {

    protected Integer balanceIndex;
    protected String balanceName;
    protected List<BalancePort> balancePortSet;

    /**
     * Gets the value of the balanceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBalanceIndex() {
        return balanceIndex;
    }

    /**
     * Sets the value of the balanceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBalanceIndex(Integer value) {
        this.balanceIndex = value;
    }

    /**
     * Gets the value of the balanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceName() {
        return balanceName;
    }

    /**
     * Sets the value of the balanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceName(String value) {
        this.balanceName = value;
    }

    /**
     * Gets the value of the balancePortSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balancePortSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalancePortSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalancePort }
     * 
     * 
     */
    public List<BalancePort> getBalancePortSet() {
        if (balancePortSet == null) {
            balancePortSet = new ArrayList<BalancePort>();
        }
        return this.balancePortSet;
    }

}
