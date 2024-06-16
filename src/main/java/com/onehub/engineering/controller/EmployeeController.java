package com.onehub.engineering.controller;

import com.onehub.engineering.model.Employee;
import com.onehub.engineering.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
        try {
            Employee newEmployee = employeeService.addEmployee(employee);
            return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
