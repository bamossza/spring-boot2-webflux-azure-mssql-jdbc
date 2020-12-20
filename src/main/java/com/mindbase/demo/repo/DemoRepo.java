package com.mindbase.demo.repo;

import com.mindbase.demo.dto.Employee;
import com.mindbase.demo.repo.mapper.DemoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Log4j2
@Repository
@RequiredArgsConstructor
public class DemoRepo {

  final NamedParameterJdbcTemplate namedTemplate;

  public Flux<Employee> findAll() {
    String sql = """
            select username,
                   firstname,
                   lastname,
                   address
            from [employee].employees
                   """;
    // where username = :username
    var params =
            new MapSqlParameterSource();
//                    .addValue("username", "username");
    return Flux.fromIterable(namedTemplate.query(sql, params, DemoMapper.SINGLETON));
  }

  public Mono<Boolean> insert(Employee employee) {
    String sql = """
            """;
    var params =
            new MapSqlParameterSource()
                    .addValue("uid", UUID.randomUUID().toString().replaceAll("-", ""));
    // namedTemplate.update(sql, params);
    return Mono.fromCallable(() -> true);
  }

}
