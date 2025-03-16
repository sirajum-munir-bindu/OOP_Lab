abstract class Vehicle {
    protected String brand;
    protected String speed;

    public Vehicle(String brand , String speed){
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void display();
}
