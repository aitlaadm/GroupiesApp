package group.example.group.model;

import java.util.ArrayList;
import java.util.List;

public class Groups {
    static List<String> groupsList=new ArrayList<String>();

    public Groups(List<String> groupsList) {
        this.groupsList = groupsList;
    }
    public Groups() {
    }

    public static List<String> getGroupsList() {
        return groupsList;
    }

    public static void setGroupsList(List<String> groupsL) {
        groupsList = groupsL;
    }

    public static void addGroup(Group group){
        groupsList.add(group.getGroupName());
    }

    public static boolean deleteGroup(Group group){
        if(groupsList.contains(group.getGroupName())){
            groupsList.remove(group.getGroupName());
            return true;
        }else {
            return false;
        }
    }
}
