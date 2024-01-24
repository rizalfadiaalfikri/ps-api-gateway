package id.co.swamedia.apigateway.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// import springfox.documentation.swagger.web.SwaggerResource;
// import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

// @Component
// @Primary
// @EnableAutoConfiguration
public class GatewaySwaggerResourceProvider /*implements SwaggerResourcesProvider */ {

    // @Override
    // public List<SwaggerResource> get() {
    //     List<SwaggerResource> resources = new ArrayList<>();
    //     resources.add(swaggerResource("master-service", "/v1/master/v2/api-docs", "2.0"));
    //     resources.add(swaggerResource("access-management", "/v1/access/v2/api-docs", "2.0"));
    //     resources.add(swaggerResource("asdp-data-collection", "/v1/data-core/v2/api-docs", "2.0"));
    //     resources.add(swaggerResource("mitra-data-collection", "/v1/data-mitra/v2/api-docs", "2.0"));
    //     resources.add(swaggerResource("settlement-in", "/v1/settlement-in/v2/api-docs", "2.0"));
    //     resources.add(swaggerResource("settlement-out", "/v1/settlement-out/v2/api-docs", "2.0"));
    //     return resources;
    // }

    // private SwaggerResource swaggerResource(String name, String location, String version) {
    //     SwaggerResource swaggerResource = new SwaggerResource();
    //     swaggerResource.setName(name);
    //     swaggerResource.setLocation(location);
    //     swaggerResource.setSwaggerVersion(version);
    //     return swaggerResource;
    // }
}
