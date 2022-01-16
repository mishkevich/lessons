package by.overone.spring.mvc.entity;

import javax.validation.constraints.*;
import java.util.Objects;


public class Employee {

    @Size(min = 2, max = 10, message = "name invalid - need more than 2 and less then 10")
    private String name;

//    @NotNull
//    @NotEmpty(message = "should be not empty")
    @NotBlank(message = "should be not blank")
    private String surname;

    @Min(value = 500, message = "greater or equal than 500")
    @Max(value = 1000, message = "must be less or equal than 1000")
    private Double salary;

    private String department;
    private String carBrand;

    private String[] languages;

    @Pattern(regexp = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,3}$",
            message = "invalid email should xxxx@xxxx.xx")
    private String email;

    public Employee(String name, String surname, Double salary, String department, String carBrand, String[] languages, String email) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        this.carBrand = carBrand;
        this.languages = languages;
        this.email = email;
    }

    public Employee() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(salary, employee.salary) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
