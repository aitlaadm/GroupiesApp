package group.example.group.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private  String groupName;
    private  int groupCapacite;
    List<String> groupUsers = new ArrayList<String>();

    public Group(){}
    public Group(String groupName){
        this.groupName=groupName;
    }
    public Group(String groupName, int capacite){
        this.groupName=groupName;
        this.groupCapacite=capacite;
    }

    public Group(String groupName, int groupCapacite, List<String> groupUsers){
        this.groupName=groupName;
        this.groupCapacite=groupCapacite;
        this.groupUsers=groupUsers;
    }

    public void addToGroup(String user){
        if(groupUsers.size()<groupCapacite)
            groupUsers.add(user);
    }
    public boolean deleteUserFromGroup(String user){
        if(groupUsers.contains(user)){
            groupUsers.remove(user);
            return true;
        }else{
            return false;
        }
    }
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupN) {
        groupName = groupN;
    }

    public  int getGroupCapacite() {
        return groupCapacite;
    }

    public void setGroupCapacite(int capacite) {
        groupCapacite = capacite;
    }

    public List<String> getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(List<String> groupU) {
        groupUsers = groupU;
    }
}
