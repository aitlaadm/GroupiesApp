package group.example.group.DAO;


import group.example.group.model.Group;

import java.util.List;

public interface GroupiesDAOI {

    List<String> getUsers();
    void createUser(String user);
    List<Group> getGroups();
    String getAdminName();
    void lastMinOrlastMax(String response);
    void deleteGroup(String group);
}
