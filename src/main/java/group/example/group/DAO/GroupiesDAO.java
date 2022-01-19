package group.example.group.DAO;

import group.example.group.model.Users;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GroupiesDAO implements GroupiesDAOI{
    @Override
    public List<String> getUsers() {
        return Users.getUsersList();
    }

    @Override
    public boolean createUser(String user) {
        Users.addUser(user);
        if(getUsers().contains(user)){
            return true;
        }else{
            return false;
        }

    }
    }

