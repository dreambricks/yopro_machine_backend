package com.dreambricks.yopro_machine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class YoproMachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoproMachineApplication.class, args);
	}

	@Configuration
	public class WebConfig implements WebMvcConfigurer {
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedOrigins("*") // Permitir acesso de todos os domínios
					.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
					.allowedHeaders("*")
					.allowedOriginPatterns("*");
		}
	}
}

