package com.vee.demo;

import com.opensymphony.xwork2.ActionSupport;

public class MaintenanceController extends ActionSupport{
	private String labelDisplay;

	public String getLabelDisplay() {
		return labelDisplay;
	}

	public void setLabelDisplay(String labelDisplay) {
		this.labelDisplay = labelDisplay;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
