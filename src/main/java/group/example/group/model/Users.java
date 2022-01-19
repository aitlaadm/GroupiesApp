package group.example.group.model;

import java.util.ArrayList;
import java.util.List;

public class Users {

    static List<String> usersList=new ArrayList<String>();

    public Users(){}
    public Users(List<String> usersList){
        this.usersList=usersList;
    }
    public static void addUser(String user){
        usersList.add(user);
    }

    public static boolean deleteUser(User user){
        if(usersList.contains(user.getUsername())){
            usersList.remove(user.getUsername());
            return true;
        }else{
            return false;
        }
    }
    public static List<String> getUsersList() {
        return usersList;
    }

    public static void setUsersList(List<String> usersL) {
        usersList = usersL;
    }
}
