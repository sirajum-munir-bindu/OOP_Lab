import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many Employees do you want : ");
        int a = sc.nextInt();

        sc.nextLine();
        for(int i = 0; i < a ; i++)
        {
            System.out.print("Enter name: ");
            String s1 = sc.nextLine();

            System.out.print("Salary: ");
            double d = sc.nextDouble();

            System.out.print("Position: ");
            String s2 = sc.nextLine();

            Employee emp1 = new Employee(s1 , d , s2);
            emp1.displayEmployee();
            emp1.increaseSalary(5000);
            emp1.displayEmployee();

        }

    }
}
