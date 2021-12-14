package com.springbootcrud.jdbc;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TeachersJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachersJdbcApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.springbootcrud.jdbc")).build().apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
            "Spring Boot Swagger2 Example API",
            "JDBC CRUD Operation",
            "1.0",
            "Free to Use",
            new springfox.documentation.service.Contact("Arun Kumar", null,
                "arun.kumar@codebele.com"),
            "Apache License Version 2.0",
            "https://www.apache.org/licenses/",Collections.emptyList()
        );

        return apiInfo;
	}
}
