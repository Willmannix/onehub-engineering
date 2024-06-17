package com.onehub.engineering.response;

import lombok.Data;

@Data
public class EmployeeResponse {
    private Long employeeNo;
    private String firstname;
    private String surname;
    private String email;
}