package com.f_rafael.microservicio_2__proyecto_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Microservicio2Proyecto5Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicio2Proyecto5Application.class, args);
	}

}
