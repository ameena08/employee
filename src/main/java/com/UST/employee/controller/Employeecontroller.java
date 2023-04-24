package com.UST.employee.controller;

import com.UST.employee.entity.Employee;
import com.UST.employee.services.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@RequestMapping("/hello")
public class Employeecontroller {
    @Autowired
    private Employeeservice employeeservice;

    @PostMapping("/")
    public Employee addEmployee(@RequestBody Employee employee) {
        return (Employee) employeeservice.createEmployee(employee);
    }

    @GetMapping("/get")
    public List<Employee> getAllEmployee() {
        return employeeservice.getEmployees();
    }

    @GetMapping("/get/{empId}")
    public Employee getEmployeeById(@PathVariable String empId) {
        return employeeservice.findByempId(empId);
    }


@Transactional
    @DeleteMapping("/deleteemployee/{empId}")
    public String deleteEmployee(@PathVariable String empId) {
        return employeeservice.deleteEmployeeByEmpId(empId);
    }
}
