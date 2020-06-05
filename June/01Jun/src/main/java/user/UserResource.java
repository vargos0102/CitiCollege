package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;


    @GetMapping("/user/allUsers")
    public List<User> retriveAllUsers()
    {
        return service.findAll();
    }

    @GetMapping("/user/{id}")
    public User retrieveUser(@PathVariable Integer id)
    {
        return service.findOne(id);
    }
}
