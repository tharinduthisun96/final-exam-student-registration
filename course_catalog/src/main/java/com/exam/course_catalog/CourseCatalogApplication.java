package com.exam.course_catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CourseCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseCatalogApplication.class, args);
	}

}
