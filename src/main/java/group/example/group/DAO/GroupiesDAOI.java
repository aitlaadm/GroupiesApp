package group.example.group.DAO;


import java.util.List;

public interface GroupiesDAOI {

    List<String> getUsers();
    boolean createUser(String user);
}
