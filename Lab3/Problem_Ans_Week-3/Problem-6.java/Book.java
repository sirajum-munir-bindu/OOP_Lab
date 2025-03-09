public class Book {
    private String title;
    private String author;
    private String isBorrowed;

    public Book(String title , String author)
    {
        this.title = title;
        this.author = author;
    }

    public void setIsBorrowedBorrow(String isBorrowed)
    {
        this.isBorrowed = isBorrowed;
    }

    public String getIsBorrowed() {
        return isBorrowed;
    }

    public void displayBook()
    {
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nBorrow status: "+isBorrowed);
    }

}
