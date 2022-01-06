package by.overone.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet dog = new Dog();
//        Person person = new Person(dog);
//        person.callYourPet();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet myPet = context.getBean("myPet", Pet.class);
//        Person person = new Person(myPet);
//        person.callYourPet();
//
//        context.close();
        Person myPerson = context.getBean("myPerson", Person.class);
        myPerson.callYourPet();
        System.out.println(myPerson);
    }
}
