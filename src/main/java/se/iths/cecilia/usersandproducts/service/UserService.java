package se.iths.cecilia.usersandproducts.service;

import org.springframework.stereotype.Service;
import se.iths.cecilia.usersandproducts.model.User;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers(){
        List<User> users =
                List.of(new User(1,"John_Doe_11", "password11", "john@doe.com"),
                        new User(2, "Jane_Doe_22", "password22", "jane@doe.com"));
        return users;
    }

}
