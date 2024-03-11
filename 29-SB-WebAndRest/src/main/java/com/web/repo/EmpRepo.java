package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
