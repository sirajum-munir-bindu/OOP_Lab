public class Buy {
    private Customer customer;
    private Item item;
    private String date;
    private String quantity;

    public Buy(Customer c , Item i , String date , String quantity)
    {
        this.customer = c;
        this.item = i;
        this.date = date;
        this.quantity = quantity;
    }

    public void displayBuy()
    {
        customer.displayCustomer();
        item.displayItem();
        System.out.println("Buying date: "+date+" Buying quantity: "+quantity);
    }
}
