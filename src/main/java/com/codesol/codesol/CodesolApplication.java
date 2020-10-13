package com.codesol.codesol;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CodesolApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CodesolApplication.class, args);
		System.out.println("Welcome to springboot sam..");
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
