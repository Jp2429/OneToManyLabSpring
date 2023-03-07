package com.codeclan.OneToManyLab;

import com.codeclan.OneToManyLab.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyLabApplication {
	@Autowired
	AssignmentRepository assignmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyLabApplication.class, args);
	}

}
