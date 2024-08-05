// src/main/java/com/example/repository/EmployeeRepository.java

package com.example.dettol.repository;

import com.example.dettol.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
