package by.overone.hibernate_test.test;

import by.overone.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//            // HQL - Hibernate Query Language
//            List<Employee> employees = session.createQuery("from Employee", Employee.class)
//                    .getResultList();
//
//            session.getTransaction().commit();
//            System.out.println(employees);


//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            List<Employee> employees = session.createQuery("from Employee where name = 'Oleg'", Employee.class)
//                    .getResultList();
//
//            session.getTransaction().commit();
//            System.out.println(employees);

//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            List<Employee> employees = session.createQuery("from Employee where name = :name", Employee.class)
//                    .setParameter("name", "Oleg")
//                    .getResultList();
//
//            session.getTransaction().commit();
//
//            System.out.println(employees);

//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 0);
//            employee.setSalary(500);
//
//            session.getTransaction().commit();
//
//            System.out.println(employee);

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            session.createQuery("update Employee set salary = :salary" +
                    " where name = :name")
                    .setParameter("salary",500)
                    .setParameter("name", "Ivan")
                    .executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
