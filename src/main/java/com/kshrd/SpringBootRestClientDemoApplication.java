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
	
	@RequestMapping("/users")
	public String user(){
		return "dt/users";
	}
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	@RequestMapping("/create")
	public String create(){
		return "create";
	}
	
	@RequestMapping("/datatable")
	public String dataTable(){
		return "dt/datatable";
	}
	
	@RequestMapping("/datatable-objects")
	public String dataTableObject(){
		return "dt/datatable-objects";
	}
	
}
