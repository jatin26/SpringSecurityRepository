package com.spring.security.initializr.SpringSecurityInitializr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import JWT.AuthenticationEntryPoint.JWTAuthentication;
import JWT.AuthenticationEntryPoint.JWTHelper;
import JWT.AuthenticationEntryPoint.JwtAuthenticationFilter;
import SecurityConfiguration.ApplicaitonSecurityConfiguration;
import SecurityConfiguration.JwtConfiguration;
import WebController.AuthController;
import WebController.HTTPController;

@SpringBootApplication
@ComponentScan(basePackageClasses = { HTTPController.class, JwtConfiguration.class,
		ApplicaitonSecurityConfiguration.class, JWTAuthentication.class, JWTHelper.class, JwtAuthenticationFilter.class,
		AuthController.class })
public class SpringSecurityInitializrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityInitializrApplication.class, args);
	}

}
