package com.ilare.springboot.thymleaf.spring_theamleaf_practice.dao;

import com.ilare.springboot.thymleaf.spring_theamleaf_practice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
