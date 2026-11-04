package com.financorp.serf.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    OpenAPI serfOpenApi() {
        return new OpenAPI().info(new Info().title("SERF · API FinanCorp").version("1.0.0")
                .description("Inventario por filial, ventas, configuración y reportes en EUR. "
                        + "Tasas educativas fijas. Prototipo académico sin autenticación. YAML: /v3/api-docs.yaml."));
    }
}
