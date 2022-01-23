package by.overone.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String getInfo() {
        return "view-for-all";
    }

    @GetMapping("hr-info")
    public String hrInfo() {
        return "hr-info";
    }

    @GetMapping("manager-info")
    public String managerInfo() {
        return "manager-info";
    }
}
