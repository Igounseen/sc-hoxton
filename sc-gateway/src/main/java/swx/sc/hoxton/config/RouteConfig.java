package swx.sc.hoxton.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("sc-user", r -> r.path("/sc-user/**")
                        .uri("lb://sc-user"))
                .route("sc-network", r -> r.path("/sc-network/**")
                        .uri("lb://sc-network"))
                .build();
    }

}
