package by.overone.rest.controller;

import by.overone.rest.entity.Employee;
import by.overone.rest.exception_handling.EmployeeIncorrectData;
import by.overone.rest.exception_handling.NoSuchEmployeeException;
import by.overone.rest.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public Employee create(@RequestBody Employee employee) {
        employeeService.create(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee) {
        employeeService.create(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String delete(@PathVariable Long id) {
        if (employeeService.findById(id) == null) {
            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in database.");
        }
        employeeService.delete(id);
        return "Employee with ID = " + id + " was deleted";
    }

}
