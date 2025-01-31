import java.util.Scanner;

public class Main {
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Student id: ");
        String sid = sc.nextLine();


        System.out.print("Enter the Student Name: ");
        String sn = sc.nextLine();


        System.out.print("Enter the Student CGPA: ");
        double scg = sc.nextDouble();


        System.out.print("Enter the Student Exam id: ");
        String eid = sc.nextLine();
        sc.nextLine();


        System.out.print("Enter the Student Exam Name: ");
        String en = sc.nextLine();


        System.out.print("Enter the Student Exam Marks: ");
        double em = sc.nextDouble();

        System.out.print("Enter the Student Exam date: ");
        String edate = sc.nextLine();


        System.out.print("Enter the Student Semester: ");
        String es = sc.nextLine();

        Student st = new Student(sid , sn , scg);
        Exam ex = new Exam(eid , en , em);
        Appears ap = new Appears(st , ex , edate , es);

        ap.displayAppears();
    }

}
