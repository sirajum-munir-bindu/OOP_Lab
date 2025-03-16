public class Car extends Vehicle{
    private String fuelType;

    public Car(String fuelType , String brand , String speed)
    {
        super(brand , speed);
        this.fuelType = fuelType;
    }
    public void display()
    {
        System.out.println(fuelType+", "+brand+", "+speed);
    }

}
