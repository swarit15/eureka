package com.eureka.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-producer")
public interface ProducerFeign {

	@RequestMapping(value="/getProducer", method=RequestMethod.GET)
	String getProducer();
}
