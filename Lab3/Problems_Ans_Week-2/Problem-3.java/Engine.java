public class Engine {
    private String type;
    private String emodel;

    public Engine(String type , String emodel)
    {
        this.type = type;
        this.emodel = emodel;
    }

    public void displayEngine()
    {
        System.out.println("Engine Type: "+type+"   Engine Model: "+emodel);
    }
}
