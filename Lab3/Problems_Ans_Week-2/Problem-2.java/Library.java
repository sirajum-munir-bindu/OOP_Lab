import java.util.*;

public class Library {
    private String libName;
    ArrayList<Book> books = new ArrayList<>();

    public Library(String libName)
    {
        this.libName = libName;
    }

    public void addBooks(Book b1)
    {
        books.add(b1);
    }

    public void displayLiberaryItem()
    {
        System.out.println("Liberary Name: "+libName);

        for(Book b2: books)
        {
            b2.displayBook();
        }
    }
}
