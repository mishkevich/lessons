package by.overone.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat created");
    }

    @Override
    public void say() {
        System.out.println("Mew-mew");
    }
}
