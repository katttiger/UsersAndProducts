package se.iths.cecilia.usersandproducts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.cecilia.usersandproducts.model.User;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user")
    public String user(Model model)
    {
        List<User> users =
                List.of(new User(1,"John_Doe_11", "password11", "john@doe.com"),
                        new User(2, "Jane_Doe_22", "password22", "jane@doe.com"));

        model.addAttribute("users", users);
        return "users";
    }
}
