package com.rakshan.rest.webservices.restful_web_services.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SpringSecurityConfiguration {
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
//1) All requests should be authenticated
		
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated()
				);

//2) Id a rewquest is not authenticated, a web page is shown
		
		http.httpBasic(withDefaults());

//3) CSRF -> POSt, PUT  we need to disable csrf so post and put requests will be accepted 
		
		http.csrf(csrf -> csrf.disable());
		
		
		return http.build();
	}
}
