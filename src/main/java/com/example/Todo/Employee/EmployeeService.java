package com.example.Todo.Employee;

import com.example.Todo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    protected Iterable<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    protected Employee getEmployeebyId(Integer id){
        return employeeRepository.findById(id).get();
    }

}
