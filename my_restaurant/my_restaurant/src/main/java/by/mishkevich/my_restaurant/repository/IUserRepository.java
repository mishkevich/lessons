package by.mishkevich.my_restaurant.repository;

import by.mishkevich.my_restaurant.entity.User;
import by.mishkevich.my_restaurant.entity.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository <User, Long> {

    User findAllByUsername(String username);

    List<User> findAllByStatus(Status status);

    List<User> findAllByEnabled(boolean enabled);
}
