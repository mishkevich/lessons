package by.overone.hibernate_test2.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "my_db.details")
public class Details {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "empDetails",
            cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private Employee employee;

    public Details() {
    }

    public Details(String city, String phoneNumber, String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Details(String city, String phoneNumber, String email, Employee employee) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return id == details.id && Objects.equals(city, details.city) && Objects.equals(phoneNumber, details.phoneNumber) && Objects.equals(email, details.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, phoneNumber, email, employee);
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", employee=" + employee +
                '}';
    }
}

