package by.overone.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {

//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext("by.overone.spring");
//        Person myPerson = context.getBean("myPerson", Person.class);
//        System.out.println(myPerson);
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person myPerson = context.getBean("person", Person.class);
//        Person myPerson1 = context.getBean("person", Person.class);
//        Person myPerson2 = context.getBean("person", Person.class);
//        Person myPerson3 = context.getBean("person", Person.class);
//        System.out.println(myPerson.hashCode());
//        System.out.println(myPerson1.hashCode());
//        System.out.println(myPerson2.hashCode());
//        System.out.println(myPerson3.hashCode());
//
//        context.close();
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
//        Cat cat1 = context.getBean("cat", Cat.class);
//        Cat cat2 = context.getBean("cat", Cat.class);
//        Cat cat3 = context.getBean("cat", Cat.class);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);

//        person.callYourPet();
//
//        context.close();
    }
}
