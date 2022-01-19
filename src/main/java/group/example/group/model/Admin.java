package group.example.group.model;

public class Admin {
    private final String admin="admin";
    public static int i=0;
    private int last_min;
    private int last_max;
    private int capacite;
    private int nbGroup;

    public Admin(){}
    public Admin(int last_min, int last_max){
        this.last_min=last_min;
        this.last_max=last_max;
    }

    public Admin(int last_min, int last_max,int nbGroup){
        this.last_min=last_min;
        this.last_max=last_max;
        this.nbGroup=nbGroup;
    }

    public Admin(int last_min, int last_max,int nbGroup,int capacite){
        this.last_min=last_min;
        this.last_max=last_max;
        this.nbGroup=nbGroup;
        this.capacite=capacite;
    }

    public void createGroups(int nbGroup){
        Groups groups = new Groups();
        for(int j=0;j<=nbGroup;j++){
            Group group = new Group("Group"+i,capacite);
            groups.addGroup(group);
            i++;
        }
    }

    public void lastMinOrlastMax(String response){
        if(response.equals("last_min")){
            nbGroup=Users.usersList.size()/Groups.groupsList.size()-1;
            createGroups(nbGroup);
        }
    }
    public int getLast_min() {
        return last_min;
    }

    public void setLast_min(int last_min) {
        this.last_min = last_min;
    }

    public int getLast_max() {
        return last_max;
    }

    public void setLast_max(int last_max) {
        this.last_max = last_max;
    }

    public int getNbGroup() {
        return nbGroup;
    }

    public void setNbGroup(int nbGroup) {
        this.nbGroup = nbGroup;
    }

    public String getAdmin() {
        return admin;
    }
}
