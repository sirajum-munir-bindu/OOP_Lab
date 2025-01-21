import java.util.*;
public class Employee {
    private String empID;
    private String name;
    private int salary;

    public Employee(String empID , String name , int salary)
    {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("Employee id is: " +empID);
        System.out.println("Employee name is : "+name);
        System.out.println("Employee salary is: "+salary);
    }

    public void displayBonus()
    {
        double s1 , s;
        s1 = this.salary * 0.1;
        s = this.salary + s1;
        System.out.println("Employee total salary after 10% bonus: "+s);
    }

    public static void main(String[] x1)
    {
        Scanner sc = new Scanner(System.in);
        String a , b ;
        int c;
        System.out.print("Enter the employee ID : ");
        a = sc.nextLine();

        System.out.print("Enter the employee name: ");
        b = sc.nextLine();

        System.out.print("Enter the employee salary: ");
        c = sc.nextInt();

        Employee e = new Employee(a , b , c);
        e.display();
        e.displayBonus();

    }
}
