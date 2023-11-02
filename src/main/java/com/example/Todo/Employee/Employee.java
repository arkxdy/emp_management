package com.example.Todo.Employee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int emp_id;

    @Column(name="emp_name")
    private String emp_name;

    @Column(name="emp_email")
    private String emp_email;
}
