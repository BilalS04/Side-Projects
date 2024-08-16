package com.example.spring_jsp_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.spring_jsp_demo")
public class SpringJspDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJspDemoApplication.class, args);
	}

}
 