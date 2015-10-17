
package jaxws.smsc.subscriber;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subscriberPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscriberPort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="layoutId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="layoutName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bsgwArg0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bsgwArg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balanceMapPort" type="{http://wsi.mc.nuevatel.com/}balanceMapPort" minOccurs="0"/>
 *         &lt;element name="balanceMapPortWH" type="{http://wsi.mc.nuevatel.com/}balanceMapPort" minOccurs="0"/>
 *         &lt;element name="holdChargePortList" type="{http://wsi.mc.nuevatel.com/}holdChargePort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscriberPort", propOrder = {
    "name",
    "layoutId",
    "layoutName",
    "bsgwArg0",
    "bsgwArg1",
    "balanceMapPort",
    "balanceMapPortWH",
    "holdChargePortList"
})
public class SubscriberPort {

    protected String name;
    protected Integer layoutId;
    protected String layoutName;
    protected Integer bsgwArg0;
    protected String bsgwArg1;
    protected BalanceMapPort balanceMapPort;
    protected BalanceMapPort balanceMapPortWH;
    protected List<HoldChargePort> holdChargePortList;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the layoutId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLayoutId() {
        return layoutId;
    }

    /**
     * Sets the value of the layoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayoutId(Integer value) {
        this.layoutId = value;
    }

    /**
     * Gets the value of the layoutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutName() {
        return layoutName;
    }

    /**
     * Sets the value of the layoutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutName(String value) {
        this.layoutName = value;
    }

    /**
     * Gets the value of the bsgwArg0 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBsgwArg0() {
        return bsgwArg0;
    }

    /**
     * Sets the value of the bsgwArg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBsgwArg0(Integer value) {
        this.bsgwArg0 = value;
    }

    /**
     * Gets the value of the bsgwArg1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsgwArg1() {
        return bsgwArg1;
    }

    /**
     * Sets the value of the bsgwArg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsgwArg1(String value) {
        this.bsgwArg1 = value;
    }

    /**
     * Gets the value of the balanceMapPort property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceMapPort }
     *     
     */
    public BalanceMapPort getBalanceMapPort() {
        return balanceMapPort;
    }

    /**
     * Sets the value of the balanceMapPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceMapPort }
     *     
     */
    public void setBalanceMapPort(BalanceMapPort value) {
        this.balanceMapPort = value;
    }

    /**
     * Gets the value of the balanceMapPortWH property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceMapPort }
     *     
     */
    public BalanceMapPort getBalanceMapPortWH() {
        return balanceMapPortWH;
    }

    /**
     * Sets the value of the balanceMapPortWH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceMapPort }
     *     
     */
    public void setBalanceMapPortWH(BalanceMapPort value) {
        this.balanceMapPortWH = value;
    }

    /**
     * Gets the value of the holdChargePortList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holdChargePortList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoldChargePortList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldChargePort }
     * 
     * 
     */
    public List<HoldChargePort> getHoldChargePortList() {
        if (holdChargePortList == null) {
            holdChargePortList = new ArrayList<HoldChargePort>();
        }
        return this.holdChargePortList;
    }

}
