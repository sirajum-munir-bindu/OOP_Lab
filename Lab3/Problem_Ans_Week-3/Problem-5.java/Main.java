import java.util.Scanner;

public class Main {
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double d = sc.nextDouble();

        Circle c = new Circle(d);

        c.display();
    }
}
