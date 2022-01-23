package by.overone.rest.service.impl;

import by.overone.rest.entity.Employee;
import by.overone.rest.exception_handling.NoSuchEmployeeException;
import by.overone.rest.repository.IEmployeeRepository;
import by.overone.rest.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Employee findById(Long id) {
        Employee employee = employeeRepository.findById(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in database.");
        }
        return employee;
    }

    @Override
    @Transactional
    public void create(Employee employee) {
        employeeRepository.create(employee);
    }

    @Override
    @Transactional
    public void delete(Long empId) {
        employeeRepository.delete(empId);
    }
}
