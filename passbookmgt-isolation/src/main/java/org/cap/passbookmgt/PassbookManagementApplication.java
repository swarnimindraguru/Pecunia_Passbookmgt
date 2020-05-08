package org.cap.passbookmgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnablePassbookManagement;
import org.springframework.web.client.RestTemplate;

/**
 * this is equal to three annotations
 * 1) @Configuration
 * 2)@ComponentScan
 * 3)@EnableAutoConfiguration
 */
@SpringBootApplication
@EnablePassbookManagement
public class PassbookManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassbookManagementApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
