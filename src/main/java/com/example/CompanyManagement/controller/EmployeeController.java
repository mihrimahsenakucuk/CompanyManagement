package com.example.CompanyManagement.controller;

import com.example.CompanyManagement.entity.Employee;
import com.example.CompanyManagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeservice;

    public EmployeeController(EmployeeService employeeservice) {
        this.employeeservice = employeeservice;
    }

    @GetMapping
    public List<Employee> findAllEmployee(){
        return employeeservice.findAllEmployee();
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeservice.saveEmployee((employee));
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeservice.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        employeeservice.deleteEmployee(id);
    }


}
