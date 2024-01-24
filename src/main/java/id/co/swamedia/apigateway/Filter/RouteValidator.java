package id.co.swamedia.apigateway.Filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final List<String> endpoints = List.of("/api/v1/switcher/auth/register", "/api/v1/switcher/auth/validate-token", "/api/v1/switcher/auth/login", "/eureka");
    public Predicate<ServerHttpRequest> isSecured = serverHttpRequest -> endpoints.stream()
            .noneMatch(uri -> serverHttpRequest.getURI().getPath().contains(uri));
}
