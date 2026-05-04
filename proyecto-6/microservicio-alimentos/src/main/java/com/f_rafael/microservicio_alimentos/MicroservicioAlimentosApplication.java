package com.f_rafael.microservicio_alimentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservicioAlimentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAlimentosApplication.class, args);
	}

}
