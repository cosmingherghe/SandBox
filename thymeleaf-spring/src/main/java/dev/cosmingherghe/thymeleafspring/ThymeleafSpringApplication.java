package dev.cosmingherghe.thymeleafspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;

@SpringBootApplication
public class ThymeleafSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafSpringApplication.class, args);
	}
}
