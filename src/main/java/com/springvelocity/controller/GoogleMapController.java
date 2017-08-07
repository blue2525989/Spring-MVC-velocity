package com.springvelocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoogleMapController {

	@RequestMapping(value="/location", method=RequestMethod.GET)
	public ModelAndView location() {
		ModelAndView model = new ModelAndView();
		model.setViewName("pages/location");
		return model;
	}
}
