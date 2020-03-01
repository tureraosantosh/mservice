package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class PatientPropsModel {

	private String branchName;
	private String applicationName;
	private String port;

	public PatientPropsModel() {
		// TODO Auto-generated constructor stub
	}

	public PatientPropsModel(String branchName, String applicationName, String port) {
		super();
		this.branchName = branchName;
		this.applicationName = applicationName;
		this.port = port;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
