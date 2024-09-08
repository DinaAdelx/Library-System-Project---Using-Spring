package main.config;

import io.swagger.models.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket productAPI() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("main"))
                .build()
                .apiInfo(NewApi);
    }

    public static final Contact NewInfo = new Contact().name("Dina Adel");

    public static final ApiInfo NewApi = new ApiInfo("Library System Project",
            "System Database Functionalities",
            "1.0", "urn:tos",
            NewInfo.getName(),
            "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");

}
