package com.eureka.server;

/*@EnableWebSecurity
@Configuration*/
public class AdminSecurityConfig/* extends WebSecurityConfigurerAdapter*/ {
	
	/*@SuppressWarnings("deprecation")
	@Bean
	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
		return new InMemoryUserDetailsManager(
				User.withDefaultPasswordEncoder().username("user").password("password")
						.authorities("ROLE_USER").build(),
				User.withDefaultPasswordEncoder().username("admin").password("admin")
						.authorities("ROLE_ACTUATOR", "ROLE_USER").build());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http.authorizeRequests()
				.requestMatchers(EndpointRequest.to("health", "info")).permitAll()
				.requestMatchers(EndpointRequest.toAnyEndpoint().excluding(MappingsEndpoint.class)).hasRole("ACTUATOR")
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
				.antMatchers("/**").hasRole("USER")
				.and()
			.cors()
				.and()
			.httpBasic();
		// @formatter:on
	}*/

}
