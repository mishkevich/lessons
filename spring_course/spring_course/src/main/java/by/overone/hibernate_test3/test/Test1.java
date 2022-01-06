package by.overone.hibernate_test3.test;

import by.overone.hibernate_test3.entity.Department;
import by.overone.hibernate_test3.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try {
            //1
//            Session session = factory.getCurrentSession();
//
//            Department hr = new Department("HR", 1500, 400);
//            Employee employee = new Employee("Anna", "Viktorovna", 700);
//            Employee employee1 = new Employee("Olga", "Ivanovna", 590);
//
//            hr.addEmployeeToDepartment(employee);
//            hr.addEmployeeToDepartment(employee1);
//
//            session.beginTransaction();
//
//            session.save(hr);
//
//            session.getTransaction().commit();

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get department ..........");
            Department department = session.get(Department.class, 1);
            System.out.println("Get department successful ");

            System.out.println("Get employees from department");
            List<Employee> employees = department.getEmployees();
            System.out.println("Get employees successful ");

            System.out.println("sout employees .........");
            employees.forEach(System.out::println);
            System.out.println("end sout employees .........");

            session.getTransaction().commit();

            //2
//            Session currentSession = factory.getCurrentSession();
//
//            currentSession.beginTransaction();
//            Employee employee = currentSession.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            currentSession.getTransaction().commit();

            //cascade - all      emp -> dep -> all emp
//            Session currentSession = factory.getCurrentSession();
//
//            Employee employee = currentSession.get(Employee.class, 1);
//            currentSession.delete(employee);
//
//            currentSession.getTransaction().commit();

            // cascade delete remove type
//            Session currentSession = factory.getCurrentSession();
//            currentSession.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
