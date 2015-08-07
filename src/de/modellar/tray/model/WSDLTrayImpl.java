package de.modellar.tray.model;

import de.modellar.tray.service.GetUserDrivesResponse;
import de.modellar.tray.service.LoginDetails;
import de.modellar.tray.service.GetFolderPathResponse;
import de.modellar.tray.service.CurrentLocation;

import javax.jws.WebService;

@WebService(endpointInterface = "de.modellar.tray.model.WSDLTray")
public class WSDLTrayImpl implements WSDLTray {

	@Override
	public GetUserDrivesResponse getUserDrives(LoginDetails loginDetailsRequest) {
		GetUserDrivesResponse resp = new 	GetUserDrivesResponse();
		
		resp.addNewDrive(loginDetailsRequest, "blubber");
		resp.addNewDrive(loginDetailsRequest, "blub1");
		resp.getDrive(loginDetailsRequest);
		
	
		return resp;
	}
	
	@Override
	public GetFolderPathResponse getFolderPath(CurrentLocation floc){
		GetFolderPathResponse fresp = new GetFolderPathResponse();
		
		fresp.addFolder(floc);
		return fresp;
	}

}
