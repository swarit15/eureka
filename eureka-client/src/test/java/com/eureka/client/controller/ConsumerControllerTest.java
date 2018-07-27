package com.eureka.client.controller;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eureka.client.feign.ProducerFeign;

@RunWith(SpringJUnit4ClassRunner.class)
public class ConsumerControllerTest {
	
	@InjectMocks
	private ConsumerController controller;

	@Mock
	private ProducerFeign fiegn;
	
	@Before
	public void setupDependecy() {
		when(fiegn.getProducer()).thenReturn("Producer Test");
	}
	
	@Test
	public void testConsumer() {
		System.out.println("###########"+controller.sayHi());
	}
}
