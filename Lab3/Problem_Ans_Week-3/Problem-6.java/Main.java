import java.util.Scanner;

public class Main {
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Book title: ");
        String s1 = sc.nextLine();

        System.out.print("Author Name: ");
        String s2 = sc.nextLine();

        System.out.print("Borrowed Status: ");
        String s3 = sc.nextLine();

        Book b = new Book(s1 , s2);
        b.setIsBorrowedBorrow(s3);
        b.displayBook();
    }
}
