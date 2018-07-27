package com.eureka.producers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {


	@RequestMapping(value="/getProducer", method=RequestMethod.GET)
	public String getProducer() {
		return "USA2-EAST-ZONE";
		//return "LONDON";
		//return "SINGAPORE";
	}
	
	
}
