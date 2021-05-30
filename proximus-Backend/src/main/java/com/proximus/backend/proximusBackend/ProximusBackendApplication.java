package com.proximus.backend.proximusBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author Marwa Essahli
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.proximus.backend.proximusBackend.controller",
        "com.proximus.backend.proximusBackend.model",
        "com.proximus.backend.proximusBackend.service"
    })
public class ProximusBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProximusBackendApplication.class, args);
	}
	
	/**
	 * Object Mapper.
	 * 
	 * @return the object mapper
	 */
	 @Bean
	    public ObjectMapper objectMapper() {
		    ObjectMapper objectMapper = new ObjectMapper();
	        return objectMapper;
	    }

}
