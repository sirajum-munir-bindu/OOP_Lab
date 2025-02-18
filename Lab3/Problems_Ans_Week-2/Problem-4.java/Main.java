import java.util.Scanner;

public class Main {

        public static void main(String[] x)
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter User ID: ");
            String s3 = sc.nextLine();

            Passport pp = new Passport(s3);

            System.out.print("Enter User name: ");
            String  s1 = sc.nextLine();

           Person p = new Person(pp ,s1);



            p.displayPerson();

        }
}
