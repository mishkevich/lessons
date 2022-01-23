package org.example;

import org.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL = "http://localhost:8080/rest/api/employees";

    public List<Employee> findAll() {
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET,
                null, new ParameterizedTypeReference<>() {
                });
        return responseEntity.getBody();
    }

    public Employee findById(int id) {
        return restTemplate.getForObject(URL + "/" + id, Employee.class);
    }

    public void save(Employee employee) {
        Long id = employee.getId();
        if (id == null || id == 0) {
            ResponseEntity<Employee> responseEntity = restTemplate.postForEntity(URL, employee, Employee.class);
            System.out.println(responseEntity.getBody());
            System.out.println("Employee was added");
        } else {
            restTemplate.put(URL, employee);
            System.out.println("Employee with ID = " + id + " was update");
        }
    }

    public void delete(int id) {
        restTemplate.delete(URL + "/" + id);
        System.out.println("Employee with ID = " + id + " was deleted");
    }
}
