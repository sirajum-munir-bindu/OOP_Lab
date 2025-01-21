import java.util.*;
public class Book {

    private String title;
    private String author;
    private String price;

    public Book() {}

    public Book(String title,String author, String price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void display() {
        System.out.println("The book Title is ="+title);
        System.out.println("The author name of the book is ="+author);
        System.out.println("The price of the book is ="+price);
    }

    public static void main(String[] x1) {
        Scanner sc = new Scanner(System.in);

        String x , y , z;

        System.out.print("Enter the book Title: ");
        x= sc.nextLine();

        System.out.print("Enter the book Author Name: ");
        y= sc.nextLine();

        System.out.print("Enter the book Price: ");
        z= sc.nextLine();

        Book b1= new Book();
        b1.display();

        Book b2= new Book(x , y , z);
        b2.display();

    }

}
