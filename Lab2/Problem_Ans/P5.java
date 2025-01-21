import java.util.*;
public class Rectangle {

    private int length;
    private int width;
    private double area;
    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
        this.area = area;

    }

    public void display()
    {
        area = length * width;

        System.out.println("Area of the circle is : " +area);
    }
    public static void main(String[] b){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The length = ");
        int  x =sc.nextInt();

        System.out.print("Enter The Width = ");
        int  z =sc.nextInt();


        Rectangle r = new Rectangle(x , z);
        r.display();
    }

}
