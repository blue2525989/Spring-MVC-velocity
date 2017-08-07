package com.springvelocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
	
	private static final String TO = "jbierbrauer99@gmail.com";
	
	private JavaMailSenderImpl mailSender;
	
	@Autowired
	@Qualifier("mailSender")
	public void setMailSender(JavaMailSenderImpl mailSend) {
		this.mailSender = mailSend;
	}

	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public ModelAndView contactPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("pages/email");		
		return model;
	}
	
	@RequestMapping(value="/sendEmail", method=RequestMethod.POST)
	public ModelAndView sendEmail(@RequestParam String name, @RequestParam String email, 
			@RequestParam String subject, @RequestParam String body) {
		ModelAndView model = new ModelAndView();
		model.setViewName("pages/saved");
		//create new email and send it
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(TO);
		message.setFrom(email);
		message.setSubject(name + " | " + subject);
		message.setText("| " + name + " | " + subject + " | " + body);
		mailSender.send(message);
		// add message
		String saved = "Thank you, " + name + ", Your email is on the way and will be responded to shortly.";
		model.addObject("saved", saved);
		return model;
	}
}
