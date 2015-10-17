
package jaxws.smsc.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for friendPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="friendPort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="friendName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="friendLayoutId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "friendPort", propOrder = {
    "friendName",
    "friendLayoutId"
})
public class FriendPort {

    protected String friendName;
    protected Integer friendLayoutId;

    /**
     * Gets the value of the friendName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendName() {
        return friendName;
    }

    /**
     * Sets the value of the friendName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendName(String value) {
        this.friendName = value;
    }

    /**
     * Gets the value of the friendLayoutId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFriendLayoutId() {
        return friendLayoutId;
    }

    /**
     * Sets the value of the friendLayoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFriendLayoutId(Integer value) {
        this.friendLayoutId = value;
    }

}
