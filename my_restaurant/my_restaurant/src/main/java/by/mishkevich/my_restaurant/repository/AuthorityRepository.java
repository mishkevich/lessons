package by.mishkevich.my_restaurant.repository;

import by.mishkevich.my_restaurant.entity.Authority;
import by.mishkevich.my_restaurant.entity.User;
import by.mishkevich.my_restaurant.entity.enums.AuthorityEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    List <User> findAllByAuthorityEnum (AuthorityEnum authorityEnum);
}
