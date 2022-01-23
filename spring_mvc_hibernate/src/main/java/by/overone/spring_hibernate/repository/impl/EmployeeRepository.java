package by.overone.spring_hibernate.repository.impl;

import by.overone.spring_hibernate.entity.Employee;
import by.overone.spring_hibernate.repository.IEmployeeRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository implements IEmployeeRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Employee", Employee.class)
                .getResultList();
    }

    @Override
    public Employee findById(Long id) {
        return sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @Override
    public void create(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }

    @Override
    public void delete(Long empId) {
        sessionFactory.getCurrentSession()
                .createQuery("delete from Employee where id =:empId")
                .setParameter("empId", empId)
                .executeUpdate();
    }
}
