package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args); // run method returns objects.
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		//Since the SpringApplication.run method returns component objects, we pass it to a context that can hold them.
		
		//aliean a = new aliean(); // Since context already holds the object, we dont instantiate it again.
		aliean a = context.getBean(aliean.class); // get objects from aliean class.
		a.compiling();
		System.out.println("Hello World!");
	}

}
