package com.momo.k8smomo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class K8sMomoApplication {
	@GetMapping("/message")
	public String displayMessage(){
		return "Congratulation you successfully deployed your application to kubernetes !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(K8sMomoApplication.class, args);
	}

}
