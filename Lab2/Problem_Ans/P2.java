import java.util.*;

public class Circle {
    private double r;
    private double area;
    private double circum;
    public Circle(double r)
    {
        this.r = r;
        this.area = r * 3.1416 * r;
        this.circum = 2 * 3.1416 *r;
    }

    public void display()
    {
        System.out.println("Area of the circle is : " +area);
        System.out.println("Circumference of the circle is : " +circum);
    }
    public static void main(String[] b){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Circle Radius = ");
        double x =sc.nextDouble();
        Circle c1 = new Circle(x);
        c1.display();
    }
}
