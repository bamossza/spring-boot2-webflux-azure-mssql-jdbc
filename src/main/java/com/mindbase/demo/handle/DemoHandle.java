package com.mindbase.demo.handle;

import com.mindbase.demo.dto.Employee;
import com.mindbase.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Log4j2
@Service
@RequiredArgsConstructor
public class DemoHandle extends CommonHandler {

  final DemoService demoService;

  @NotNull
  public Mono<ServerResponse> getAll(ServerRequest sr) {
    return success(demoService.findAll().collectList());
  }

  @NotNull
  public Mono<ServerResponse> insert(ServerRequest sr) {
    return success(sr
            .bodyToMono(Employee.class)
            .flatMap(body -> demoService.insert(body)));
  }

}
