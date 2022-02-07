package by.mishkevich.restaurant.service.impl;

import by.mishkevich.restaurant.entity.Employee;
import by.mishkevich.restaurant.repository.IEmployeeRepository;
import by.mishkevich.restaurant.service.IEmployeeService;
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
