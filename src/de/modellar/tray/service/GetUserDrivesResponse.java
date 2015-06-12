
package de.modellar.tray.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import de.modellar.tray.model.WSDLTray_Service;


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
 *         &lt;element name="drive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "drive"
})
@XmlRootElement(name = "getUserDrivesResponse")
public class GetUserDrivesResponse {
	


    @XmlElement(required = true)
    protected List<DriveType> drive;
  

    /**
     * Gets the value of the drive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    
    // MISSING Exeption? Prüf das homeURL funktioniert / String
    public List<DriveType> getDrive(LoginDetails loginData) {
        if (drive == null) {
        		
        		drive = new ArrayList<DriveType>();   
        		drive.add(getHomeDriveType(loginData));
        		
        } 
        
        return this.drive;
    }
    
    /**
     * This Method create the new home Drive.
     */
    public DriveType getHomeDriveType(LoginDetails loginData){
    	
    	DriveType homeDriveType = new DriveType();
    	
    	String url = WSDLTray_Service.SERVICE.getNamespaceURI() + loginData.getUsername();
    	url = url + "/" + homeDriveType.getDriveName();
    	
    	homeDriveType.setDriveURL(url);
    	
    	return homeDriveType;
    }
    
    /**
     * This Method create a new DriveType and add it to List "drive" 
     * If the "home" Drive isn´t crated jet it will be created too
     */
    public void setNewDrive (LoginDetails loginData, String newDriveName){
    	
    	DriveType newDriveType = new DriveType();
    	
    	newDriveType.setDriveName(newDriveName);
    	
    	String url = WSDLTray_Service.SERVICE.getNamespaceURI() + loginData.getUsername();
    	url = url + "/" + newDriveName;
    	
    	newDriveType.setDriveURL(url);
    	
    		if(drive == null){
    			
    			drive = new ArrayList<DriveType>();
    			drive.add(getHomeDriveType(loginData));
    			drive.add(newDriveType);
    			
    		} else {
    			
    			drive.add(newDriveType);
    			
    		}
    	
    	}
   
}
