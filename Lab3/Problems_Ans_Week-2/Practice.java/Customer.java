public class Customer {
    private String custid;
    private String name;
    private String email;

    public Customer(String custid , String name, String email)
    {
        this.custid = custid;
        this.name = name;
        this.email = email;
    }

    public void displayCustomer()
    {
        System.out.println("Customer id: "+custid+" Customer name: "+name+" Customer email: "+email);
    }
}
