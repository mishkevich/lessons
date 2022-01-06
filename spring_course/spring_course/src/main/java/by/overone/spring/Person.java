package by.overone.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Objects;

@Component
@Scope("singleton")
public class Person {

    @Autowired
    @Qualifier("cat")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
//    @Value("Ivanov")
//    private String surname;
//    @Value("33")
//    private int age;

//    public Person() {
//    }

    //    @Autowired
    public Person(
//            @Qualifier("cat")
            Pet pet) {
        System.out.println("Person created");
        this.pet = pet;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Init method");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroy method");
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello my pet");
        pet.say();
    }

    // pet -> setPet
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(pet, person.pet) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pet, surname, age);
    }
}
