package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"application.controller", "application.dto", "application.entity", "application.repository", "application.service"})
public class ArtworksAPIApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArtworksAPIApplication.class, args);
	}
}
