
package de.modellar.tray.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import de.modellar.tray.service.GetUserDrives;
import de.modellar.tray.service.GetUserDrivesResponse;
import de.modellar.tray.service.LoginDetails;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.modellar.tray.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserDrivesRequest_QNAME = new QName("http://localhost:8080/myService/", "getUserDrivesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.modellar.tray.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginDetails }
     * 
     */
    public LoginDetails createLoginDetails() {
        return new LoginDetails();
    }

    /**
     * Create an instance of {@link GetUserDrivesResponse }
     * 
     */
    public GetUserDrivesResponse createGetUserDrivesResponse() {
        return new GetUserDrivesResponse();
    }

    /**
     * Create an instance of {@link GetUserDrives }
     * 
     */
    public GetUserDrives createGetUserDrives() {
        return new GetUserDrives();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "service.tray.modellar.de", name = "getUserDrivesRequest")
    public JAXBElement<LoginDetails> createGetUserDrivesRequest(LoginDetails value) {
        return new JAXBElement<LoginDetails>(_GetUserDrivesRequest_QNAME, LoginDetails.class, null, value);
    }

}
