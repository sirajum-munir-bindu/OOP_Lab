public class Car {
    private String brand;
    private String model;
    private int speed;
    private static final int MAX_SPEED = 200;


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= MAX_SPEED) {
            this.speed = speed;
            System.out.println("Speed set to: " + speed + " km/h");
        } else {
            System.out.println("Invalid speed! Speed must be between 0 and " + MAX_SPEED + " km/h.");
        }
    }


    public int getSpeed() {
        return speed;
    }


    public void displayCarInfo() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Current Speed: " + speed + " km/h");
    }
}
