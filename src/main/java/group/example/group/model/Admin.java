package group.example.group.model;

public class Admin {
    private static final String admin="admin";
    public static int i=0;
    private static int capacite;
    private static int nbGroup;

    public Admin(){}


    public Admin(int nbGroup){
        this.nbGroup=nbGroup;
    }

    public Admin(int nbGroup,int capacite){
        this.nbGroup=nbGroup;
        this.capacite=capacite;
    }

    public static void createGroups(int nbGroup){
        Groups groups = new Groups();
        for(int j=0;j<=nbGroup;j++){
            Group group = new Group("Group"+i,capacite,Users.usersList);
            groups.addGroup(group);
            i++;
        }
    }

    public static void lastMinOrlastMax(String response){
        if(response.equals("last_min")){
            capacite=Users.usersList.size()%5-1;
            createGroups(4);
        }else if(response.equals("last_max")){
            capacite=Users.usersList.size()%5;
            createGroups(5);
        }
    }

    public int getNbGroup() {
        return nbGroup;
    }

    public void setNbGroup(int nbGroup) {
        this.nbGroup = nbGroup;
    }

    public static String getAdmin() {
        return admin;
    }
}
