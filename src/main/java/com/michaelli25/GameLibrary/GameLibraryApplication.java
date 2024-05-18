package com.michaelli25.gamelibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.michaelli25.gamelibrary.restcontroller", "com.michaelli25.gamelibrary.business.service", "com.michaelli25.gamelibrary.integration"})
@MapperScan("com.michaelli25.gamelibrary.integration.mapper")
public class GameLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameLibraryApplication.class, args);
	}

}
