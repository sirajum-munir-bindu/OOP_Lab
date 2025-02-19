import java.util.Scanner;

public class Main {
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Student Name: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the Student Roll Number: ");
        String s2 = sc.nextLine();
        System.out.println("Enter the Student Grade: ");
        double d1 = sc.nextDouble();

        Student s = new Student();

        s.setName(s1);
        s.setRoll(s2);
        s.setGrade(d1);

        s.displayStudent();
    }

}
