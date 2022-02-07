package by.mishkevich.my_restaurant.service;

import by.mishkevich.my_restaurant.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
