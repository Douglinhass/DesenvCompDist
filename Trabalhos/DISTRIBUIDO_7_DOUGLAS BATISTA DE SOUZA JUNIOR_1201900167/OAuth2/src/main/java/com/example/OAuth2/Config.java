package com.example.OAuth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class Config extends WebSecurityConfigurerAdapter{
	
	
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {
		  httpSecurity
          .antMatcher("/**").authorizeRequests()
          .antMatchers("/").permitAll()
          .anyRequest().authenticated()
          .and()
          .oauth2Login();
	}

}
