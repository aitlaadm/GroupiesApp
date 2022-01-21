package group.example.group.DAO;

import group.example.group.model.Admin;
import group.example.group.model.Group;
import group.example.group.model.Groups;
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
    public void createUser(String user) {
            Users.addUser(user);
    }

    @Override
    public List<Group> getGroups() {
        return Groups.getGroupsList();
    }

    @Override
    public String getAdminName() {
        return Admin.getAdmin();
    }

    @Override
    public void lastMinOrlastMax(String response) {
        Admin.lastMinOrlastMax(response);
    }

    @Override
    public void deleteGroup(String group) {
        Groups.deleteGroup(group);
    }

    @Override
    public void createGroup(int nbGroup) {
        Admin.createGroups(nbGroup);
    }


}

