import java.util.*;
public class Student {
    private String name;
    private String Id;
    private double cg;

    public Student(String name , String Id , double cg)
    {
        this.name= name;
        this.Id = Id;
        this.cg = cg;
    }

    public void display()
    {
        System.out.println("Name is : " +name);
        System.out.println("Id is : " +Id);
        System.out.println("CGPA is : " +cg);
    }

    public static void main(String[] b)
    {
        Scanner sc=new Scanner(System.in);

        String n , i;
        double c;

        System.out.print("Enter Student Name: " );
        n = sc.next();

        System.out.print("Enter Student Id: " );
        i = sc.next();

        System.out.print("Enter Student CGPA: " );
        c = sc.nextDouble();

        Student s = new Student(n , i , c);
        s.display();


    }
}
