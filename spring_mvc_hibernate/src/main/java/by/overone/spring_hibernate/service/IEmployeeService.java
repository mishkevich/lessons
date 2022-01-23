package by.overone.spring_hibernate.service;

import by.overone.spring_hibernate.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();

    Employee findById(Long id);

    void create(Employee employee);

    void delete(Long empId);
}
