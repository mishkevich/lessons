package by.overone.rest.service;


import by.overone.rest.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();

    Employee findById(Long id);

    void create(Employee employee);

    void delete(Long empId);
}
