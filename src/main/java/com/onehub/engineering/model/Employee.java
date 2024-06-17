package com.onehub.engineering.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeNo;

    private String title;
    private String firstname;
    private String surname;
    private LocalDate dob;
    private String gender;
    private String email;
    private String address;

}
