package com.example;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {

}
