
package de.modellar.tray.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "in", "homeDriveName", "driveName"
})
@XmlRootElement(name = "getUserDrives")
public class GetUserDrives {
	

    @XmlElement(required = true)
    protected String in;
    @XmlElement(required = true)
    public String homeDriveName = "/home";
    @XmlElement(required = true)
    public String driveName = "";

    /**
     * Ruft den Wert der in-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn() {
        return in;
    }

    /**
     * Legt den Wert der in-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn(String value) {
        this.in = value;
    }
    
    /**Getter and Setter for created Drives
     * */
    public void setDriveName(String newDriveName){
    	this.driveName = "/" + newDriveName;
    }
    
    public String getDriveName(){
    	return driveName;
    }
    
  /**Getter and Setter for the Start Drive
   * */  
    public void setHomeDriveName(String newHomeDriveName){
    	this.homeDriveName = "/" + newHomeDriveName;
    }
    
    public String getHomeDriveName(){
    	return homeDriveName;
    }


}
