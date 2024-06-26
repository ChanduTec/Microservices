package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.PersonServivce;

@SpringBootApplication
public class OneToOneReletaionshipMaveenApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToOneReletaionshipMaveenApplication.class,
				args);
		PersonServivce personServivce = context.getBean(PersonServivce.class);
		personServivce.savePerson();
		
		System.out.println();
	}

}
