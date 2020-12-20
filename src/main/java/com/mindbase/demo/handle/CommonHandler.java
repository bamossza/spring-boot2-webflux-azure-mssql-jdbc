package com.mindbase.demo.handle;

import com.mindbase.demo.dto.SuccessResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Log4j2
@Service
public abstract class CommonHandler {

  Mono<ServerResponse> success(Mono<?> mono) {
    return ServerResponse.ok()
            .contentType(APPLICATION_JSON)
            .body(mono.map(m -> SuccessResponse.builder(m).build())
                    .subscribeOn(Schedulers.elastic()), SuccessResponse.class);
  }

}
