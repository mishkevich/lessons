package by.overone.hibernate_test2.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "my_db.employees2")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private int salary;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "details_id")
    private Details empDetails;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String name, String surname, String department, int salary, Details empDetails) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.empDetails = empDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Details getEmpDetails() {
        return empDetails;
    }

    public void setEmpDetails(Details empDetails) {
        this.empDetails = empDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) && Objects.equals(department, employee.department) &&
                Objects.equals(empDetails, employee.empDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, department, salary, empDetails);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", empDetails=" + empDetails +
                '}';
    }
}
