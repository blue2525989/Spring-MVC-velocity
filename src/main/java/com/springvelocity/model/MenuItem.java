package com.springvelocity.model;

public class MenuItem {

	private String name;
	
	private String description;
	
	private String price;
	
	public MenuItem () {}
	
	public MenuItem(String n, String d, String p) {
		this.name = n;
		this.description = d;
		this.price = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
