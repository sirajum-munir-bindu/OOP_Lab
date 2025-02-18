public class Person {

    private Passport passport;
    private String name;

    public Person(Passport passport , String name)
    {
        this.passport = passport;
        this.name = name;
    }


    public void displayPerson()
    {
        System.out.println("User Name is: "+name);
        passport.displayPassport();
    }
}
