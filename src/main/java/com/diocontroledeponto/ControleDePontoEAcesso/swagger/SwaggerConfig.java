package com.diocontroledeponto.ControleDePontoEAcesso.swagger;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.ModelSpecification;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	//ant("/**"))
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.diocontroledeponto.ControleDePontoEAcesso"))
			.paths(PathSelectors.any())
			.build()
			.apiInfo(apiInfo())
						.globalRequestParameters(
						Collections.singletonList(
								new RequestParameterBuilder()
								.name("Authorization")
								.in(ParameterType.HEADER)
								.parameterIndex(1)
								.description("Header para Token JWT")
								.required(false)
								.build()
				)
		);

//		This was used by the instructor but is deprecated, so I use the
//		new methods globalRequestParameters and RequestParameterBuilder as above.

//                .globalOperationParameters(
//                        Collections.singletonList(
//                                new ParameterBuilder()
//                                        .name("Authorization")
//                                        .description("Header para Token JWT")
//                                        .modelRef(new ModelRef("string"))
//                                        .parameterType("header")
//                                        .required(false)
//                                        .build()
//                        )
//                );


	}

	@Bean
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
			.title("API-REST")
			.description("API para gerenciamento de ponto e acesso.")
			.version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
			.contact(new Contact("Thiago Geronimo", "https://www.linkedin.com/in/thiagogeronimo/", "thi.matheus@gmail.com"))
			.build();
	}

}
