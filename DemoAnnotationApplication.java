package com.example.demoAnnotation;

import com.example.demoAnnotation.entity.Number;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Scanner;
import java.util.Set;

@SpringBootApplication
public class DemoAnnotationApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "shukla");
		SpringApplication.run(DemoAnnotationApplication.class, args);


	}

}
