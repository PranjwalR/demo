package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpbApplication1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(FirstSpbApplication1Application.class, args);
		Custumer s = context.getBean(Custumer.class);
		s.display();
				
		
	}

}
