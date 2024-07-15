package couple;

import couple.tight.userManager;

public class tightCouplingMain {

    public static void main(String[] args){
        System.out.println("Tight Coupling");
        userManager userManager = new userManager();
        System.out.println(userManager.getUserDetailsFromDatabase());
    }

}
