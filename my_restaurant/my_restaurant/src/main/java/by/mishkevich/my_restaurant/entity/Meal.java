package by.mishkevich.my_restaurant.entity;


import by.mishkevich.my_restaurant.entity.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Enumerated (EnumType.STRING)
    @Column(name = "category")
    private Category category;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "orders_has_meals",
            joinColumns = @JoinColumn(name = "meal_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Collection<Order> ordersMeal;

}
