package com.mindbase.demo.repo.mapper;


import com.mindbase.demo.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public enum DemoMapper implements RowMapper<Employee> {
  SINGLETON;

  @Override
  public Employee mapRow(ResultSet rs, int i) throws SQLException {
    return new Employee(
            null,
            rs.getString("username"),
            rs.getString("firstname"),
            rs.getString("lastname"),
            rs.getString("address")
    );
  }
}
