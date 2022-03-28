package com.practica.ibm.spring;

import com.practica.ibm.spring.test.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

//		Test test = new Test();
//		System.out.println(Test.ID);
	}

}
