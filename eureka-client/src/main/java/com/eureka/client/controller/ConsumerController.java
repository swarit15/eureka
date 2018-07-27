package com.eureka.client.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.feign.ProducerFeign;

@RestController
public class ConsumerController {
	

	@Autowired
    private LoadBalancerClient loadBalancer;
	
	@Autowired
	private ProducerFeign producerFeign;
	
	@RequestMapping(value="/consumer", method=RequestMethod.GET)
	public String sayHi() {
		return "Hi "+producerFeign.getProducer();
	}
	
	@RequestMapping(value="/load", method=RequestMethod.GET)
	public String doStuff() {
        ServiceInstance instance = loadBalancer.choose("eureka-producer");
        URI producuerURI = URI.create(String.format("http://%s:%s", instance.getHost(), instance.getPort()));
        return producuerURI.toString();
    }
}
