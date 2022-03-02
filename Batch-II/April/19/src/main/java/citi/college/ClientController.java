package citi.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@CrossOrigin
public class ClientController {

    @Autowired
    ClientRepository clientRepository ;

    @GetMapping("/client")
    public List<Client> index(){
        return clientRepository.findAll();
    }
}
