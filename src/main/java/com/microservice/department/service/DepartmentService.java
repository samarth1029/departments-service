package com.microservice.department.service;

import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment service");
        return departmentRepository.save(department);
    }

    public Optional<Department> findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById service");
        return departmentRepository.findById(departmentId);
    }
}
