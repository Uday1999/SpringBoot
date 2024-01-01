package com.Expence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
public class ExpenseSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseSystemApplication.class, args);
	}

}
