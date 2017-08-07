package com.springvelocity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springvelocity.model.MenuItem;

@Service("menuService")
public class MenuService {

	public List<MenuItem> menuItems() {
		List<MenuItem> menuItems = new ArrayList<MenuItem>();	
		menuItems.addAll(createMenuItems());
		return menuItems;
	}
	
	public List<MenuItem> createMenuItems() {
		List<MenuItem> items = new ArrayList<MenuItem>();
		MenuItem burgerAndFries = new MenuItem("Cheese Burger and Fries", "Try out mouth watering 1/2lb "
				+ "beef burger, add cheese for an extra $1.00.", "4.99");
		items.add(burgerAndFries);
		return items;
	}
}
