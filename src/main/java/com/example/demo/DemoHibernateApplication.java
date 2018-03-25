package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ServiceImpl.userServiceImpl;

@SpringBootApplication
public class DemoHibernateApplication implements CommandLineRunner {
	@Autowired
	userServiceImpl userService;
	public static void main(String[] args) {
		SpringApplication.run(DemoHibernateApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		System.out.println(userService.getAll());
		
		
	}
}
