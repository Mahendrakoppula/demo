package com.first.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
//@EnableSwagger2
public class FirstprojectApplication {

	public static void main(String[] args) {
		var cxt= SpringApplication.run(FirstprojectApplication.class, args);
		System.out.println("!@#$%^&*");
		System.out.println(cxt);
		Myclass myclass = cxt.getBean("myBean",Myclass.class);
		System.out.println(myclass.sayhello());

	}


	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello, World!";
	}


}


