import java.util.*;
public class Main {
    public static void main(String [] x)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Company Name: ");
        String c1 = sc.nextLine();

        Company c = new Company(c1);

        System.out.print("Enter How many employee's ID you want to add: ");
        int a = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < a; i++)
        {
            System.out.print("Enter Employee Id: ");
            String e1 = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String e2 = sc.nextLine();

            System.out.print("Enter Employee Designation: ");
            String e3 = sc.nextLine();

            Employee e = new Employee(e1 , e2 , e3);
            c.addEmployees(e);

        }
        c.displayCompany();
    }
}

