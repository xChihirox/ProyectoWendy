package com.ejemplo.proyecto.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Chihiro
 */
@Configuration
public class OpenApiConfig {
    
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                .title("SISTEMA")
                .version("1.0")
                .description("VERSION 1")
                .contact(new Contact().name("STE").url("https://www.ste.cdmx.gob.mx/")));
    }
}
