package com.onehub.engineering.service;

import com.onehub.engineering.model.Employee;
import com.onehub.engineering.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) throws Exception {
        if (employeeRepository.existsByEmail(employee.getEmail())) {
            throw new Exception("Email already exists");
        }
        return employeeRepository.save(employee);
    }
}
