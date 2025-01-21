import java.util.*;
public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA , int sideB , int sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void display()
    {
        System.out.println("The perimeter of the triangle is: " +(sideA+sideB+sideC));
    }

    public void displayValidity()
    {
        if((this.sideA+this.sideB) > this.sideC)
        {
            if((this.sideB+this.sideC) > this.sideA)
            {
                if((this.sideA+this.sideC) > this.sideB)
                {
                    System.out.println("Valid");
                }
            }
        }
        else
        {
            System.out.println("Not Valid");
        }

    }

    public static void main(String[] x1)
    {
        int sideA, sideB, sideC;

        Scanner sc = new Scanner(System.in);

        System.out.print("Side A : ");
        sideA = sc.nextInt();

        System.out.print("Side B : ");
        sideB = sc.nextInt();

        System.out.print("Side C : ");
        sideC = sc.nextInt();



        Triangle t = new Triangle(sideA, sideB, sideC);
        t.display();
        t.displayValidity();
    }
}

