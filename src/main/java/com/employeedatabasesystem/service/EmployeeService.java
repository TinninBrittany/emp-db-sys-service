package com.employeedatabasesystem.service;

import com.employeedatabasesystem.domain.Employee;
import com.employeedatabasesystem.repository.EmployeeRepository;
import com.employeedatabasesystem.service.model.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    // service layer
    /*
    - in service layer, convert domain object data into data transfer objects (DTOs)
    - all logic goes here
     */

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeData> getAllEmployees() {
        return employeeRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    public void saveEmployee(EmployeeData emp) {
        employeeRepository.save(new Employee(emp.getFirstName(), emp.getLastName(), emp.getEmailId()));
    }

    private EmployeeData convertToDto(Employee emp) {
        EmployeeData employeeData = new EmployeeData();
        employeeData.setId(emp.getId());
        employeeData.setFirstName(emp.getFirstName());
        employeeData.setLastName(emp.getLastName());
        employeeData.setEmailId(emp.getEmailId());
        return employeeData;
    }

}
