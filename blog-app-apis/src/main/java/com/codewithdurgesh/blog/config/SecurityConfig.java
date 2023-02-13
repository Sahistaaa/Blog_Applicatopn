package com.codewithdurgesh.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	    
	
	
	
	
	protected void configure(HttpSecurity http) throws Exception{
		
		http
		.csrf().disable()
		.authorizeHttpRequests()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
		
	}

}
