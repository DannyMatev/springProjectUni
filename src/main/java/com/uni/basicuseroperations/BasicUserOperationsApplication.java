package com.uni.basicuseroperations;

import com.uni.basicuseroperations.model.UserModel;
import com.uni.basicuseroperations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class BasicUserOperationsApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {

		SpringApplication.run(BasicUserOperationsApplication.class, args);
	}
}
