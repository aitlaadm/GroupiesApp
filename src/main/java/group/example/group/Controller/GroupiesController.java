package group.example.group.Controller;

import group.example.group.DAO.GroupiesDAO;
import group.example.group.model.Group;
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

    @GetMapping("/getGroups")
    private List<Group> getAllGroups(){
        return GDAO.getGroups() ;
    }
    @GetMapping("/getAdmin")
    private String getAdmin(){
        return GDAO.getAdminName();
    }

    @PostMapping("/createGroups")
    private void createGroups(@RequestBody int nbGroup){
        GDAO.createGroup(nbGroup);
    }

    @PostMapping("/deleteGroup")
    private void deleteGroup(@RequestBody String group){
        GDAO.deleteGroup(group);
    }

}
