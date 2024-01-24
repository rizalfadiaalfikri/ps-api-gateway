package id.co.swamedia.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
// import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
// import org.springframework.cloud.netflix.eureka.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
// import springfox.documentation.swagger.web.*;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
// @EnableEurekaClient
// @EnableSwagger2
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    // @Bean
	// UiConfiguration uiConfig() {
	// 	return UiConfigurationBuilder.builder()
    //     .deepLinking(true)
    //     .displayOperationId(false)
    //     .defaultModelsExpandDepth(1)
    //     .defaultModelExpandDepth(1)
    //     .defaultModelRendering(ModelRendering.EXAMPLE)
    //     .displayRequestDuration(true)
    //     .docExpansion(DocExpansion.LIST)
    //     .filter(false)
    //     .maxDisplayedTags(null)
    //     .operationsSorter(OperationsSorter.ALPHA)
    //     .showExtensions(true)
    //     .tagsSorter(TagsSorter.ALPHA)
    //     .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
    //     .validatorUrl("validatorUrl")
    //     .build();
	// }

}
