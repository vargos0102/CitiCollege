package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;

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
        User user = service.findOne(id);
        if(user == null)
        {
            throw new UserNotFoundException("id: "+id);
        }
        return user;
    }

    @PostMapping("/user/add")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/user/delete/{id}")
    public void deleteUser(@PathVariable int id)
    {
        User user = service.deleteById(id);
        if(user==null)
        {
            throw  new UserNotFoundException("id: "+id);
        }
    }
}
