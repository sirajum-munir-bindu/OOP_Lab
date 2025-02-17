public class Car {
    private Engine engine;
    private String name;
    private String cmodel;

    public Car(Engine engine , String name , String cmodel)
    {
        this.engine = engine;
        this.name = name;
        this.cmodel = cmodel;
    }

    public void displayCar()
    {
        System.out.println("Car Name: "+name+"  Car Model: "+cmodel);
        engine.displayEngine();
    }
}
