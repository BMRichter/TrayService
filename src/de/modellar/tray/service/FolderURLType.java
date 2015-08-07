package de.modellar.tray.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderURLType", propOrder = {
    "folderName"
	})

public class FolderURLType {

    @XmlElement(required = true)
    protected String folderName;
    
    public String getFolderName(){
    	return this.folderName;
    }
    
    public void setFolderName(String value){
    	this.folderName = value;
    }
}
