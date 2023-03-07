package com.codeclan.OneToManyLab.controllers;

import com.codeclan.OneToManyLab.models.Employee;
import com.codeclan.OneToManyLab.repositories.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRespository employeeRespository;

    @GetMapping(value="/employees")
    public List<Employee> getAllEmployees(){
        return employeeRespository.findAll();
    }
}
