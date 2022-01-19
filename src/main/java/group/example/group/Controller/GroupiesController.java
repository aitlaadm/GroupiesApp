package group.example.group.Controller;

import group.example.group.DAO.GroupiesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class GroupiesController {
    @Autowired
    private GroupiesDAO GDAO;

    @PostMapping("/join")
    private void createUser(@RequestBody String user){
        GDAO.createUser(user);
    }

    @GetMapping("/getUsers")
    private List<String> getAllUsers(){
        return GDAO.getUsers();
    }

}
