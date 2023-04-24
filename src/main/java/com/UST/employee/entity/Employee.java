package com.UST.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee_details")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    public String empId;
    public String empname;
    public String emailid;
    public String designation;
    public String hr;
}
