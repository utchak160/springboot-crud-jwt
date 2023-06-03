package com.utchak160.springcrud.repository;

import com.utchak160.springcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.Collection;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    long deleteByIdIn(@NonNull Collection<Long> ids);
}
