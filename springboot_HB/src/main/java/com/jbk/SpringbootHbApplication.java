package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringbootHbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHbApplication.class, args);
	}
    @Bean
    public RestTemplate restTemplate() {
    	return new RestTemplate();
    }
}
