package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class HelloApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

    @GetMapping("/hello")
    public String Hello() {
    	return "hello";
    }
	@GetMapping("/")
	public String defaultIndex(Model model) {
		return "forward:hello";
	}
}
