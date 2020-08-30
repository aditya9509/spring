package com.spring.spring;

import com.spring.spring.dto.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		registerSingleton(applicationContext);
	}

	//Registers singleton
	private static void registerSingleton(ConfigurableApplicationContext applicationContext) {
		Person myself = new Person();

		applicationContext.getBeanFactory().registerSingleton("mybean", myself);

		Person person = (Person) applicationContext.getBean("mybean");
		System.out.println(person.toString());
	}

}
