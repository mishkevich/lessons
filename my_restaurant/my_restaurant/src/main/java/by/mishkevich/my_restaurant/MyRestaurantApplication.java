package by.mishkevich.my_restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

@SpringBootApplication
public class MyRestaurantApplication {

	@PersistenceUnit
	static EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(MyRestaurantApplication.class, args);
	}

}
