package com.creditcard;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@EnableSwagger2
@ComponentScan
@EnableAutoConfiguration


public class Ccbp1Application { 

	public static void main(String[] args) {
		SpringApplication.run(Ccbp1Application.class, args);
	}
     @Bean
     public Docket ccbp1()
     {
	return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.creditcard.controller")).build();
	  }
	@Override
	public String toString() {
		return "Hello";
	}
	@GetMapping("/test")
    public String test() {
        return "Hello!!!!!";
    }


}

