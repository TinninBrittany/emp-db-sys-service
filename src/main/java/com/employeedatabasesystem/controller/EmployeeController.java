package com.employeedatabasesystem.controller;

import com.employeedatabasesystem.domain.Employee;
import com.employeedatabasesystem.service.EmployeeService;
import com.employeedatabasesystem.service.model.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeData> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(@RequestBody EmployeeData employee) {
        employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees/{id}")
    public EmployeeData getEmployeeById(@PathVariable Long id) {
        System.out.println("ID in controller: " + id.getClass());
        return employeeService.getEmployeeById(id);
    }
}
