package de.modellar.tray.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentLocation", propOrder = {
    "currentDrive",
    "activeFolder"
	})

public class CurrentLocation {

	@XmlElement(required = true)
    protected String currentDrive;
    @XmlElement(required = true)
    protected String activeFolder;
    

    public String getCurrentDrive(){
    	return currentDrive;
    }
    
    public void setCurrentDrive(String value){
    	this.currentDrive = value;
    }
    
    
    public String getActiveFolder(){
    	return activeFolder;
    }
    
    public void setActiveFolder(String value){
    	this.activeFolder = value;
    }
}
