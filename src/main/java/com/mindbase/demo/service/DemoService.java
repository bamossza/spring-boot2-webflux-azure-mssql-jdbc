package com.mindbase.demo.service;

import com.mindbase.demo.dto.Employee;
import com.mindbase.demo.repo.DemoRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Log4j2
@Service
@RequiredArgsConstructor
public class DemoService {

  final DemoRepo repo;

  public Flux<Employee> findAll() {
    return repo.findAll();
  }

  public Mono<Boolean> insert(Employee company) {
    return repo.insert(company);
  }

//  public Mono<Boolean> update(Company company) {
//    return repo.update(company);
//  }

}
