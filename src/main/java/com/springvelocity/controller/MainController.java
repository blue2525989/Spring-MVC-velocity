package com.springvelocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springvelocity.service.TechService;

@Controller
public class MainController {
 
   @Autowired
   private TechService techService;
 
   @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
   public ModelAndView welcomePage() {
	   ModelAndView model = new ModelAndView("index");
       model.addObject("mainList", techService.techList());
       return model;
   }
}