package de.modellar.tray.model;

import de.modellar.tray.service.GetUserDrivesResponse;
import de.modellar.tray.service.LoginDetails;
import javax.jws.WebService;

@WebService(endpointInterface = "de.modellar.tray.model.WSDLTray")
public class WSDLTrayImpl implements WSDLTray {

	@Override
	public GetUserDrivesResponse getUserDrives(LoginDetails loginDetailsRequest) {
		GetUserDrivesResponse resp = new 	GetUserDrivesResponse();
		resp.getDrive().add("benedikts neues drive");
		return resp;
	}

}
