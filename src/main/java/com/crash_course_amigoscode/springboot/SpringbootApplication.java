package com.crash_course_amigoscode.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@GetMapping
	public String printHellWorld() {
		return "Hello World";
	}

	// 🔥 Add this method
//	@Bean
//	CommandLineRunner run(SoftwareDevRepository repo) {
//		return args -> {
//			SoftwareDevEntity dev1 = new SoftwareDevEntity(1, "Mayuresh", "MERN, Next, Springboot");
//			SoftwareDevEntity dev2 = new SoftwareDevEntity(2, "Redkira", "hockey, volleyball, cricket");
//
//			repo.save(dev1);
//			repo.save(dev2);
//		};
//	}
}
