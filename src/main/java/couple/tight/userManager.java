package couple.tight;

public class userManager {

    userDatabase userDatabase=new userDatabase();
    public String getUserDetailsFromDatabase()
    {
        return userDatabase.getUserDetails();
    }

}
