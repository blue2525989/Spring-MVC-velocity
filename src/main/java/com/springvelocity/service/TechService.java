package com.springvelocity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springvelocity.model.Technology;

@Service("techService")
public class TechService {
	
	public List<Technology> techList() {
		List<Technology> techs = new ArrayList<Technology>();
		Technology java = new Technology("Java", "The core of this application is built with Java.");
		Technology spring = new Technology("Spring Framework", "The Spring framework sets us up for a nice enviroment "
				+ "to build web applications in.");
		Technology velocity = new Technology("Velocity", "Velocity is an older technology but still incrediably powerful "
				+ "when used as a templating engine.");
		Technology bootstrap = new Technology("Bootstrap", "Bootstrap version 4 is used throughout to add a freindly "
				+ "user experience.");
		techs.add(java);
		techs.add(spring);
		techs.add(velocity);
		techs.add(bootstrap);
		return techs;
	}

}
