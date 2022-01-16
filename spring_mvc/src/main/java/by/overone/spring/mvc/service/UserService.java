package by.overone.spring.mvc.service;

import by.overone.spring.mvc.entity.Employee;

import java.util.List;

public interface UserService {

    List<Employee> findAll();

    Employee findById(Long id);

    Employee create(Employee employee);

    Employee update(Employee employee);

    boolean delete(Long id);

}
