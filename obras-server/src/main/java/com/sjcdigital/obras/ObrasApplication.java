package com.sjcdigital.obras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan
@SpringBootApplication
@EnableTransactionManagement
@EnableMongoRepositories("com.sjcdigital.obras.model.repositories")
public class ObrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObrasApplication.class, args);
	}
		
}
