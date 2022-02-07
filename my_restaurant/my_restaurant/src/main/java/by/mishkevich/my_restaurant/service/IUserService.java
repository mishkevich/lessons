package by.mishkevich.my_restaurant.service;

import by.mishkevich.my_restaurant.entity.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User findById(Long id);

    void create(User user);

    void delete(Long id);

}
