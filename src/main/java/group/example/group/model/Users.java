package group.example.group.model;

import java.util.ArrayList;
import java.util.List;

public class Users {

    static List<String> usersList=new ArrayList<>();

    public Users(){}
    public Users(List<String> usersList){
        this.usersList=usersList;
    }

    public static void addUser(String user){
        if(!user.equals("")&&!usersList.contains(user))
            usersList.add(user);
    }

    public static boolean deleteUser(String user){
        if(usersList.contains(user)){
            usersList.remove(user);
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
