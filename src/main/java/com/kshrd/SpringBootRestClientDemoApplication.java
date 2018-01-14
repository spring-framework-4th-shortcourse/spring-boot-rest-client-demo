package com.kshrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SpringBootRestClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestClientDemoApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	@RequestMapping("/create")
	public String create(){
		return "create";
	}
	
}
