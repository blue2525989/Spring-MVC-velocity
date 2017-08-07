package com.springvelocity.model;

public class Technology {

	private String techName;
	
	private String techDescription;
	
	public Technology(String name, String description) {
		this.techName = name;
		this.techDescription = description;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getTechDescription() {
		return techDescription;
	}

	public void setTechDescription(String techDescription) {
		this.techDescription = techDescription;
	}
}
