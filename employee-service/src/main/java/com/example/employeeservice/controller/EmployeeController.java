package com.example.employeeservice.controller;

import com.example.employeeservice.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.employeeservice.service.EmployeeService;

@RestController
@RequestMapping
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") String employeeId){
        return employeeService.findEmployeeById(employeeId);
    }
}
