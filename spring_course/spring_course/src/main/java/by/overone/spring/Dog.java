package by.overone.spring;

import org.springframework.stereotype.Component;

//@Component
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog created");
    }

    @Override
    public void say() {
        System.out.println("Gaf-gaf");
    }
}
