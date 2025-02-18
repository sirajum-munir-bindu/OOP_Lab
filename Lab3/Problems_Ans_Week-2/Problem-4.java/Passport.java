public class Passport {
    private String id;

    public Passport(String id)
    {
        this.id = id;
    }

    public void displayPassport()
    {
        System.out.println("Pass port ID is: "+id);
    }
}
