package com.mindbase.demo.router;

import com.mindbase.demo.handle.DemoHandle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration(proxyBeanMethods = false)
public class DemoRouter {

  @Bean
  public RouterFunction<ServerResponse> routerFunctionV1(DemoHandle handler) {
    return route()
            .path("/api/v1/employees", builder -> builder
//                            .POST("/employees", handler::insert)
//                            .PATCH("/employees", handler::update)
                            .GET("", handler::getAll)
//                        .GET("/employees/{username}", handler::getAll)
            )
            .build();
  }

}
