package com.springvelocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("mailService")
public class Email {

	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private SimpleMailMessage preConfiguredMessage;
	
	public void sendMail(String from, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("jbierbrauer99@gmail.com");
		message.setFrom(from);
		message.setSubject(subject);
		message.setText(body);
		mailSender.send(message);
	}
	
	public void sendPreConfiguredMail(String message) {
		SimpleMailMessage mailMessage = new SimpleMailMessage(preConfiguredMessage);
		mailMessage.setText(message);
		mailSender.send(mailMessage);
	}
}
