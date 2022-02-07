package by.mishkevich.my_restaurant.controller;

import by.mishkevich.my_restaurant.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/restaurant")

public class MainController {

    @Autowired
    private IUserService userService;

    @GetMapping ("/"){

        return "main";
    }


}
