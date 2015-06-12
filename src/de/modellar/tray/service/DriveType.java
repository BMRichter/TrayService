
package de.modellar.tray.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import de.modellar.tray.model.WSDLTray_Service;


/**
 * <p>Java-Klasse für DriveType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DriveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="driveURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driveName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriveType", propOrder = {
    "driveURL",
    "driveName"
})
public class DriveType {

    @XmlElement(required = true)
    protected String driveURL;
    /**TODO: Convert dirveName String to list !!!!!*/
    @XmlElement(required = true)
    protected String driveName = "home";

    /**
     * Ruft den Wert der driveURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveURL() {
        return driveURL;
    }

    /**
     * Legt den Wert der driveURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveURL(String value) {
        this.driveURL = value;
    }

    /**
     * Ruft den Wert der driveName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveName() {
        return driveName;
    }

    /**
     * Legt den Wert der driveName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveName(String value) {
        this.driveName = value;
    }

}
