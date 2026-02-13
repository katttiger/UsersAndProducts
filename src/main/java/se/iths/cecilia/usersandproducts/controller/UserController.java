package se.iths.cecilia.usersandproducts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.cecilia.usersandproducts.model.User;
import se.iths.cecilia.usersandproducts.service.UserService;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user")
    public String user(Model model)
    {
        List<User> users=userService.getUsers();

        model.addAttribute("users", users);
        return "users";
    }
}
