package com.example.SpringBootandOAuth2Demo;

import java.util.Collections;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootandOAuth2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootandOAuth2DemoApplication.class, args);		
	}
}
