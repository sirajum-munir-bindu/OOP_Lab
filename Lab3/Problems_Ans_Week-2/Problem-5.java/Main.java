import java.util.Scanner;

public class Main {

        public static void main(String[] x)
        {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter Department Name: ");
            String s3 = sc.nextLine();

            Department d = new Department(s3);

            System.out.println("How much Employee do you want to add: ");
            int n = sc.nextInt();
            sc.nextLine();


            for(int i = 0; i < n; i++)
            {
                System.out.print("Enter Employees Name: ");
                String  s1 = sc.nextLine();
                System.out.print("Enter Employees ID: ");
                String s2 = sc.nextLine();
                Employees e = new Employees(s1 , s2);

                d.addEmployees(e);
            }

            d.displayDepartment();

        }
}
