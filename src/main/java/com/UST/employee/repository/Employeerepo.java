package com.UST.employee.repository;

import com.UST.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepo extends JpaRepository<Employee,Integer> {


    Employee findByempId(String empId);



    void deleteByEmpId(String empId);
}
