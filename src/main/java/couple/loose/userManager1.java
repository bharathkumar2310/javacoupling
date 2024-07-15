package couple.loose;

public class userManager1 {
    private dataProvider dataProvider;

    public userManager1(dataProvider dataProvider)
    {
        this.dataProvider = dataProvider;
    }

    public String getUserDetailsFromDatabase()
    {
        return dataProvider.getUserDetails();
    }

}
