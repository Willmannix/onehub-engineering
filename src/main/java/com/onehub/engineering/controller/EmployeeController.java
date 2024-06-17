package com.onehub.engineering.controller;

import com.onehub.engineering.model.Employee;
import com.onehub.engineering.response.EmployeeResponse;
import com.onehub.engineering.response.ErrorResponse;
import com.onehub.engineering.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
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

            // Construct a response object (EmployeeResponse) with limited fields
            EmployeeResponse response = new EmployeeResponse();
            response.setEmployeeNo(newEmployee.getEmployeeNo());
            response.setFirstname(newEmployee.getFirstname());
            response.setSurname(newEmployee.getSurname());
            response.setEmail(newEmployee.getEmail());

            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            // Handle generic exceptions
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setMessage("An unexpected error occurred");
            errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
