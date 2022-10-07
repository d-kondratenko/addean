package com.epic.addean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AddeanApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder confi(SpringApplicationBuilder application){
		return application.sources(AddeanApplication.class); }

	public static void main(String[] args) {
		SpringApplication.run(AddeanApplication.class, args);
	}

}
