import java.util.Scanner;

public class Main {
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Engine Model Name: ");
        String  s1 = sc.nextLine();
        System.out.print("Enter Engine Type: ");
        String s2 = sc.nextLine();

        Engine e = new Engine(s1 , s2);

        System.out.print("Enter Car Name: ");
        String s3 = sc.nextLine();
        System.out.print("Enter Car Model: ");
        String s4 = sc.nextLine();

        Car c = new Car(e , s3 , s4);

        c.displayCar();

    }
}
