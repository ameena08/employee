package com.UST.employee.services;

import com.UST.employee.entity.Employee;
import com.UST.employee.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Employeeservice {
    @Autowired
    private Employeerepo repo;

    public  Object createEmployee(Employee employee) {

        return  repo.save(employee);
    }

    public List<Employee> getEmployees() {

        return repo.findAll();
    }

    public  Employee findByempId(String empId) {

        return (Employee) repo.findByempId(empId);
    }



    public String deleteEmployeeByEmpId(String empId) {
        repo.deleteByEmpId(empId);
        return "deleted";
    }

//    public  String deleteEmployeeById(int id) {
//
//        repo.deleteById(id);
//        return "the employee information is deleted";

    }




