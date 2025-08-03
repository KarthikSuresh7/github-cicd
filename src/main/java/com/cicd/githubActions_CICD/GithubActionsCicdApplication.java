package com.cicd.githubActions_CICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCicdApplication {

	@GetMapping("/greet")
	public String greetings(){
		return "We have deployed using the maven!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsCicdApplication.class, args);
	}

}
