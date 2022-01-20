package group.example.group.model;

import java.util.ArrayList;
import java.util.List;

public class Groups {
    static List<Group> groupsList=new ArrayList<Group>();

    public Groups(List<Group> groupsList) {
        this.groupsList = groupsList;
    }
    public Groups() {
    }

    public static List<Group> getGroupsList() {
        return groupsList;
    }

    public static void setGroupsList(List<Group> groupsL) {
        groupsList = groupsL;
    }

    public static void addGroup(Group group){
        groupsList.add(group);
    }

    public static void deleteGroup(String group){
        if(groupsList.contains(group)){
            groupsList.remove(group);
    }
    }
}
