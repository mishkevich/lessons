package by.overone.spring.mvc.controller;

import by.overone.spring.mvc.entity.Employee;
import by.overone.spring.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String findAllEmployees(Model model) {
        model.addAttribute("employees", userService.findAll());
        return "get-all-employees";
    }

//    @GetMapping("/askDetails")
//    public String askEmployeeDetails() {
//        return "ask-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//
//        String employeeName = request.getParameter("employeeName");
//        employeeName = "Mr. " + employeeName;
//        model.addAttribute("nameAttribute", employeeName);
//
//        return "show-emp-details-view";
//    }

//    @PostMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String employeeName, Model model) {
//
//        employeeName = "Mr." + employeeName;
//        model.addAttribute("nameAttribute", employeeName);
//
//        return "show-emp-details-view";
//    }

    @GetMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @GetMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        }
        return "show-emp-details-view";
    }
}
