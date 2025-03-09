import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee Name: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the employee Designation: ");
        String s2 = sc.nextLine();

        System.out.print("Enter the employee Salary: ");
        double d1 = sc.nextDouble();

        Employee e = new Employee(s1 , s2 , d1);

        e.displayEmployee();

        System.out.println("\n\nAfter promoting------>>>");

        sc.nextLine();
        System.out.print("Enter the employee Designation: ");
        String s3 = sc.nextLine();

        System.out.print("Enter the employee Salary: ");
        double d2 = sc.nextDouble();

        e.promote(s3 , d2);

        e.displayEmployee();


    }
}
