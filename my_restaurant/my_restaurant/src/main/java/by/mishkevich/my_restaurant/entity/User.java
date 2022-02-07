package by.mishkevich.my_restaurant.entity;


import by.mishkevich.my_restaurant.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth; //какой правильный тип для этой переменнной?

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "discount")
    private Long discount;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

//    @Enumerated(EnumType.STRING)
    @Column(name = "enabled")
    private boolean enabled; //какой правильный тип для этой переменнной - boolean or int исходя из данных от SQL?

    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "username")
    private Authority authorityUser;

    @OneToMany(mappedBy = "usersOrder", fetch = FetchType.LAZY)
    private Collection<Order> ordersUser; // List or Collection?

}
