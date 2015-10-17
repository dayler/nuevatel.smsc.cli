
package jaxws.smsc.subscriber;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for balancePort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="balancePort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tmpIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balancePort", propOrder = {
    "tmpIndex",
    "balance",
    "startTimestamp",
    "endTimestamp",
    "rCharge"
})
public class BalancePort {

    protected Integer tmpIndex;
    protected Integer balance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimestamp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimestamp;
    protected BigDecimal rCharge;

    /**
     * Gets the value of the tmpIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTmpIndex() {
        return tmpIndex;
    }

    /**
     * Sets the value of the tmpIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTmpIndex(Integer value) {
        this.tmpIndex = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBalance(Integer value) {
        this.balance = value;
    }

    /**
     * Gets the value of the startTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Sets the value of the startTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimestamp(XMLGregorianCalendar value) {
        this.startTimestamp = value;
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
     * Gets the value of the rCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRCharge() {
        return rCharge;
    }

    /**
     * Sets the value of the rCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRCharge(BigDecimal value) {
        this.rCharge = value;
    }

}
