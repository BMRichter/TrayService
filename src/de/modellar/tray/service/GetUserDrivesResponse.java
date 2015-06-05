
package de.modellar.tray.service;

//import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

//import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
//import javax.xml.ws.WebServiceContext;
//import javax.xml.ws.handler.MessageContext;

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
    protected List<String> drive;
  

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
    public List<String> getDrive() {
        if (drive == null) {
            drive = new ArrayList<String>();   
        }
        
        return this.drive;
    }
    

//	private WebServiceContext webContext;
//	
//	public void getDriveUrl() {
//    	MessageContext mesContext = webContext.getMessageContext();
//    	HttpServletRequest response = 
//    			(HttpServletRequest)mesContext.get(MessageContext.SERVLET_REQUEST);
//    	
//    	String url = response.getServerName();
//    	drive.add(url);
//    	
//	}
    
    public void getHomeDriveUrl(LoginDetails loginData){
    	GetUserDrives homeDrive = new GetUserDrives(); 
    	
    	String url = WSDLTray_Service.SERVICE.getNamespaceURI()+ loginData.getUsername();
    	url = url + homeDrive.getHomeDriveName();
    	
    	drive.add(url);
    }
    
    public void getDriveUrl(LoginDetails loginData, String driveName){
    	String url = WSDLTray_Service.SERVICE.getNamespaceURI()+ loginData.getUsername();
    	url = url + "/" + driveName;
    	drive.add(url);
    }

   
}
