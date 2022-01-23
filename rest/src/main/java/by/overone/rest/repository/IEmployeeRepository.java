package by.overone.rest.repository;

import by.overone.rest.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {

    List<Employee> findAll();

    Employee findById(Long id);

    void create(Employee employee);

    void delete(Long empId);
}
