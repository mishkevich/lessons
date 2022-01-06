package by.overone.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
//        Pet cat = new Dog();
//        Pet dog = new Dog();
//        cat.say();
//        dog.say();
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet myPet = context.getBean("myPet", Pet.class);
//        myPet.say();
//        Pet dog = new Dog();
//        Person person = new Person(dog);
//        person.callYourPet();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person myPerson = context.getBean("myPerson", Person.class);
        Person myPerson1 = context.getBean("myPerson", Person.class);
        Person myPerson2 = context.getBean("myPerson", Person.class);
        Person myPerson3 = context.getBean("myPerson", Person.class);
        Person myPerson4 = context.getBean("myPerson", Person.class);
        Person myPerson5 = context.getBean("myPerson", Person.class);


//        myPerson.callYourPet();
        System.out.println(myPerson.hashCode());
        System.out.println(myPerson1.hashCode());
        System.out.println(myPerson2.hashCode());
        System.out.println(myPerson3.hashCode());
        System.out.println(myPerson4.hashCode());
        System.out.println(myPerson5.hashCode());

        context.close();
    }
}
