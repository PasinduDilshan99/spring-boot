package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findbyId(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);


}
