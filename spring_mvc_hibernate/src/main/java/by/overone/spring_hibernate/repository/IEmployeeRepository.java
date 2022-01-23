package by.overone.spring_hibernate.repository;

import by.overone.spring_hibernate.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {

    List<Employee> findAll();

    Employee findById(Long id);

    void create(Employee employee);

    void delete(Long empId);
}
