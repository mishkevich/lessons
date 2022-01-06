package by.overone.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet myPet = context.getBean("myPet", Pet.class);
        myPet.say();

        context.close();
    }
}
