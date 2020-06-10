package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Set;
import javax.validation.*;

import org.springframework.beans.factory.annotation.Autowired;


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

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        for (ConstraintViolation<User> violation : violations) {
            violation.getMessage();
        }

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
