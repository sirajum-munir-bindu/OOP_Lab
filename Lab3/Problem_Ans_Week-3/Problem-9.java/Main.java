public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");

        myCar.displayCarInfo();
        myCar.setSpeed(120);
        System.out.println("Updated Speed: " + myCar.getSpeed() + " km/h");

        myCar.setSpeed(220);
    }
}
