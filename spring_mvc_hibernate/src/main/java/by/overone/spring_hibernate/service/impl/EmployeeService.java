package by.overone.spring_hibernate.service.impl;

import by.overone.spring_hibernate.entity.Employee;
import by.overone.spring_hibernate.repository.IEmployeeRepository;
import by.overone.spring_hibernate.service.IEmployeeService;
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
        return employeeRepository.findById(id);
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
