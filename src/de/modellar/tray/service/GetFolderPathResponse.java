package de.modellar.tray.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFolderPathResponse", propOrder = {
    "folderURL"
	})
@XmlRootElement(name = "GetFolderPathResponse")

public class GetFolderPathResponse {

	protected List<FolderURLType> folderURL;
	
	
	/**
	 * 
	 * @param floc
	 * @return
	 */
	public List<FolderURLType> getFolderList(CurrentLocation floc) {
		
		return this.folderURL;
	}
	
	/**
	 * This Method add an Folder to List or creat if necessary via "getRootFolder" a new List
	 * @param floc
	 */
	public void addFolder(CurrentLocation floc) {
		
		if(folderURL == null) {
			
			folderURL = new ArrayList<FolderURLType>();
			folderURL.add(getRootFolder(floc));
			
		}
			
		folderURL.add(getFolderURLType(floc));
			
	}
	
	/**
	 * This Method save driveName in Object FolderURLType
	 * @param CurrentLocation
	 * @return FolderURLType(String)
	 */
	public FolderURLType getRootFolder(CurrentLocation floc) {
		
		FolderURLType folderRootName = new FolderURLType();
		
		String folderName = floc.getCurrentDrive();
		folderRootName.setFolderName(folderName);
		
		return folderRootName;

	}
	/**
	 * This Method save folderName in Object FolderURLType
	 * @param floc
	 * @return FolderURLType(String)
	 */
	//TODO was wenn die funktion aufgerufen wird und kein Folder vorhanden ist?!!
	public FolderURLType getFolderURLType(CurrentLocation floc) {
		
		if(floc.getActiveFolder() != null) {
			
			FolderURLType folderNameUrl = new FolderURLType();
			
			String folderName = floc.getActiveFolder();
			folderNameUrl.setFolderName(folderName);
			
			return folderNameUrl;
			
		} else {
		
		}	
	
		return null;
	}
	
}
