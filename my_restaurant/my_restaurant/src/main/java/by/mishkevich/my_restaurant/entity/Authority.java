package by.mishkevich.my_restaurant.entity;


import by.mishkevich.my_restaurant.entity.enums.AuthorityEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "authorities")

public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authority_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Enumerated(EnumType.STRING)
    @Column(name = "authority")
    private AuthorityEnum authorityEnum;

    @OneToOne(optional = true, mappedBy = "authorityUser")
    private User user;

}
