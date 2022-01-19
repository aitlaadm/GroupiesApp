package group.example.group.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class Group {
    private String groupName;
    private int capacite;
    Users groupUsers = new Users();

    public Group(){}
    public Group(String groupName, int capacite){
        this.groupName=groupName;
        this.capacite=capacite;
    }

    public Group(String groupName, int capacite, Users groupUsers){
        this.groupName=groupName;
        this.capacite=capacite;
        this.groupUsers=groupUsers;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Users getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(Users groupUsers) {
        this.groupUsers = groupUsers;
    }
}
