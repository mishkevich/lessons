package by.mishkevich.restaurant.controller;

import by.mishkevich.restaurant.entity.Employee;
//import by.mishkevich.restaurant.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
//    public String findAll(Model model) {
//
////        List<Employee> employees = employeeService.findAll();
////        model.addAttribute("employees", employees);
//
//        return "all-employees";
//    }

//    @GetMapping("/addEmployee")
//    public String addEmployeePage(Model model) {
//        Employee employee = new Employee();
//        model.addAttribute("employee", employee);
//        return "employee-info";
//    }

//    @PostMapping("/save")
//    public String create(@ModelAttribute(name = "employee") Employee employee) {
//        employeeService.create(employee);
//        return "redirect:/api/employees/";
//    }

//    @GetMapping("/updateInfo")
//    public String updateEmployee(@RequestParam(name = "empId") Long empId, Model model) {
//        Employee employee = employeeService.findById(empId);
//        model.addAttribute("employee", employee);
//        return "employee-info";
//    }

//    @GetMapping("/deleteEmployee")
//    public String delete(@RequestParam(name = "empId") Long empId){
//        employeeService.delete(empId);
//        return "redirect:/api/employees/";
//   }
//}
