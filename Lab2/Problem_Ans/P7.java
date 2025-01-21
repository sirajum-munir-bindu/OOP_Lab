import java.util.*;
public class Person {
    private String name;
    private int age;
    private int currentYear = 2025;

    public Person(String name , int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayDetails()
    {
        System.out.println("The person name is : " +name);
        System.out.println("The age of this person is: " +age);
    }

    public void displayYear()
    {
        int a = currentYear - this.age;
        System.out.println("Year of birth : " +a);
    }

    public static void main(String[] x1)
    {
        Scanner sc = new Scanner(System.in);
        String x;
        int y;

        System.out.print("Enter the Person name: ");
        x = sc.nextLine();

        System.out.print("Enter the Person age: ");
        y = sc.nextInt();

        Person p = new Person(x , y);
        p.displayDetails();
        p.displayYear();
    }

}
