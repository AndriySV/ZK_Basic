package com.as.mvvm;

import java.io.Serializable;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class MainViewModel implements Serializable {

	@Init
	public void init () {
		
	}
	
	String string = "Start ";

	public String getString() {
		return string;
	}

	@NotifyChange("string")
	public void setString(String string) {
		this.string = string + "  Hello !";
	}
	
	
	
	
	
}
