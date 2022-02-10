package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.email.EmailSenderService;

@SpringBootApplication
public class BugProjectApplication {
	
	@Autowired
	EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(BugProjectApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		service.sendSimpleEmail("tcslearning2422@gmail.com", "This is mail is from bug project", "This is email subject");
	}

}
