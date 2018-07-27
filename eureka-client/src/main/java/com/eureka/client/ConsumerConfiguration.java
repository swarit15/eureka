package com.eureka.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration //@Config is must
public class ConsumerConfiguration {

	/*@Bean
	public ZonePreferenceServerListFilter serverListFilter() {
		ZonePreferenceServerListFilter filter = new ZonePreferenceServerListFilter();
		filter.setZone("usa-zone");
		return filter;
	}*/

	
	@Bean
	public IRule ribbonRule() {
		return new CustomerRule();
	}

	/*@Bean
    public ServerList<Server> ribbonServerList() {
        // return new ConfigurationBasedServerList();
        StaticServerList<Server> staticServerList = new StaticServerList<>((new Server("localhost", 8001)),
                new Server("localhost", 8002), new Server("localhost", 8003));
        return staticServerList;
    }*/
	
	/*@Bean
	public IPing ribbonPing() {
		return new PingUrl();
	}*/
	
	/*@Bean
	public IRule ribbonRule() {
		return new ZoneAvoidanceRule();
	}*/
}
