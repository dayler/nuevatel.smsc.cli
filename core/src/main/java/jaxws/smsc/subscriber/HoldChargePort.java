
package jaxws.smsc.subscriber;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for holdChargePort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="holdChargePort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="holdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="chargePortList" type="{http://wsi.mc.nuevatel.com/}chargePort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "holdChargePort", propOrder = {
    "holdId",
    "endTimestamp",
    "chargePortList"
})
public class HoldChargePort {

    protected String holdId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimestamp;
    protected List<ChargePort> chargePortList;

    /**
     * Gets the value of the holdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldId() {
        return holdId;
    }

    /**
     * Sets the value of the holdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldId(String value) {
        this.holdId = value;
    }

    /**
     * Gets the value of the endTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * Sets the value of the endTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimestamp(XMLGregorianCalendar value) {
        this.endTimestamp = value;
    }

    /**
     * Gets the value of the chargePortList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargePortList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargePortList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargePort }
     * 
     * 
     */
    public List<ChargePort> getChargePortList() {
        if (chargePortList == null) {
            chargePortList = new ArrayList<ChargePort>();
        }
        return this.chargePortList;
    }

}
