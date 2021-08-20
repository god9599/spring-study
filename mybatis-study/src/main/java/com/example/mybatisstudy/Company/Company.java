package com.example.mybatisstudy.Company;

import com.example.mybatisstudy.Employee.Employee;
import lombok.Data;

import java.util.List;

@Data
public class Company {
    private int id;
    private String name;
    private String address;
    private List<Employee> employeeList;
}
