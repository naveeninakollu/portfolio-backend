package dev.naveen.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import dev.portfolio.controller.Controller;


@SpringBootApplication(scanBasePackages={
"dev.portfolio.service"})
@Import(Controller.class)
@EnableMongoRepositories(basePackages = "dev.portfolio.repository")
public class PortfolioApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(PortfolioApplication.class, args);
	}
		
}
