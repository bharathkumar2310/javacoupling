package couple;

import couple.loose.dataProvider;
import couple.loose.userDatabase1;
import couple.loose.userManager1;
import couple.loose.webServiceDatabase1;

public class looseCouplingMain {

    public  static void main(String[] args)
    {
        System.out.println("LooseCoupling");
        dataProvider dataProvider = new userDatabase1();
        userManager1 userManager = new userManager1(dataProvider);
        System.out.println(userManager.getUserDetailsFromDatabase());

// we are able to call WebServiceDatabase1 without modifying userManager1 but in tight coupling it is difficult to do so

        dataProvider dataProvider1 = new webServiceDatabase1();
        userManager1 userManager1 = new userManager1(dataProvider1);
        System.out.println(userManager1.getUserDetailsFromDatabase());


    }

}
