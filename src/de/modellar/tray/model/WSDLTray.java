package de.modellar.tray.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import de.modellar.tray.service.GetUserDrivesResponse;
import de.modellar.tray.service.LoginDetails;
import de.modellar.tray.service.GetFolderPathResponse;
import de.modellar.tray.service.CurrentLocation;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2015-03-20T13:42:35.741+01:00
 * Generated source version: 2.7.13
 * 
 */
@WebService(targetNamespace = "http://localhost:8080/myService/", name = "Tray")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WSDLTray {

    @WebResult(name = "getUserDrivesResponse", targetNamespace = "http://localhost:8080/Tray/", partName = "driveList")
    @WebMethod(action = "service.tray.modellar.de/NewOperation")
    public GetUserDrivesResponse getUserDrives(
        @WebParam(partName = "loginDetailsRequest", name = "getUserDrivesRequest", targetNamespace = "http://localhost:8080/Tray/")
        LoginDetails loginDetailsRequest
    );
    
    @WebResult(name = "getFolderPath", targetNamespace = "http://localhost:8080/Tray/", partName = "folderPath")
    @WebMethod(action = "service.tray.modellar.de/NewOperation")
    public GetFolderPathResponse getFolderPath(
    		@WebParam(partName = "getCurrentDrive", name = "getFolderPathRequest", targetNamespace = "http://localhost:8080/Tray/")
    		CurrentLocation currentLocationRequest
    );
}
