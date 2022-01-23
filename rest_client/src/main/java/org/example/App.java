package org.example;

import org.example.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        System.out.println(communication.findAll());
//        System.out.println(communication.findById(3));
//        Employee employee = new Employee(18L,"Sveta", "Lychkova", "HR", 1800);
//        communication.save(employee);
        communication.delete(18);
        communication.findById(18);
    }
}
