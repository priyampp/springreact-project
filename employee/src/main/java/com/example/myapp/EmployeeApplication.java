package com.example.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.myapp.model.User;
import com.example.myapp.repository.UserRepository;


@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String...args) throws Exception{
		
		this.userRepository.save(new User("Tyler Woods", "Training","tyler.woods@atos.net"));
		this.userRepository.save(new User("Julie Jones", "HR","julie.jones@atos.net"));
		this.userRepository.save(new User("Zachery Anderson", "Accounts and Finance ","zachery.anderson@atos.net"));
		this.userRepository.save(new User("Sutton Brady", "Information Technology","sutton.brady@atos.net"));
		this.userRepository.save(new User("Laura Ray", "Marketting","laura.ray@atos.net"));

		

	}
	
}
