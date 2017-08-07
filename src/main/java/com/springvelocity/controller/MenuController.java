package com.springvelocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springvelocity.service.MenuService;

@Controller
public class MenuController {
	
	@Autowired
	@Qualifier("menuService")
	private MenuService menuService;

	@RequestMapping(value="/menu", method=RequestMethod.GET)
	public ModelAndView menu() {
		ModelAndView model = new ModelAndView();
		model.addObject("menuList", menuService.menuItems());
		model.setViewName("pages/menu");
		return model;
	}
}
