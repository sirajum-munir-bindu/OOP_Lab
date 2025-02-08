import java.util.*;

public class Main {
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name of the Liberary: ");
        String l = sc.nextLine();

        Library li = new Library(l);

        System.out.print("Enter How many books you want to Entry: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the Book name : ");
            String bn = sc.nextLine();

            System.out.print("Enter the Book author name : ");
            String ban = sc.nextLine();

            Book b = new Book(bn , ban);
            li.addBooks(b);
        }

        li.displayLiberaryItem();
    }
}
