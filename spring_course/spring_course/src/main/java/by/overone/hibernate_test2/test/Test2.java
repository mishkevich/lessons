package by.overone.hibernate_test2.test;

import by.overone.hibernate_test2.entity.Details;
import by.overone.hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        try {
//            Session session = factory.getCurrentSession();
//            Details employee1Details = new Details("Warsawa", "4444",
//                    "igor@gmail.com");
//            Employee employee1 = new Employee("Igor", "Klimovich",
//                    "HR", 1000);
//
//            employee1Details.setEmployee(employee1);
//            session.beginTransaction();
//
//            session.save(employee1Details);
//
//            session.getTransaction().commit();

            // Details - cascade - ALL
//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Details details = session.get(Details.class, 1);
//
//            session.delete(details);
//
//            session.getTransaction().commit();


        } finally {
            factory.close();
        }
    }
}
