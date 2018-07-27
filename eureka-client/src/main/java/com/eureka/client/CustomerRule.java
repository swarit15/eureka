package com.eureka.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.netflix.loadbalancer.AbstractLoadBalancer;
import com.netflix.loadbalancer.ClientConfigEnabledRoundRobinRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.LoadBalancerStats;
import com.netflix.loadbalancer.Server;

public class CustomerRule extends ClientConfigEnabledRoundRobinRule {

	@Value("${eureka.preferable.port}")
	private String preferPort;

	private LoadBalancerStats loadBalancerStats;

	@Override
	public Server choose(Object key) {
		if (loadBalancerStats == null) {
			return super.choose(key);
		}
		List<Server> serverList = getLoadBalancer().getAllServers();
		Server chosen = null;

		for (Server server : serverList) {
			if (server.getPort() == Integer.valueOf(preferPort)) {
				chosen = server;
			}
		}
		if (chosen == null) {
			System.out.println("default server");
			return super.choose(key);
		} else {
			System.out.println("preferable server");
			return chosen;
		}
	}

	@Override
	public void setLoadBalancer(ILoadBalancer lb) {
		super.setLoadBalancer(lb);
		if (lb instanceof AbstractLoadBalancer) {
			loadBalancerStats = ((AbstractLoadBalancer) lb).getLoadBalancerStats();
		}
	}
}
