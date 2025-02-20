public class Product {
    private String name;
    private double price;
    private int quantity;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setPrice(double price)
    {
        if(price >= 0)
        {
            this.price = price;
        }
        else {
            System.out.println("Invalide prise");
        }
    }
    public double getPrice()
    {
        return price;
    }

    public void setQuantity(int quantity)
    {
        if(quantity >= 0)
        {
            this.quantity = quantity;
        }
        else {
            System.out.println("Quantity is not Valide.");
        }
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void displayProduct()
    {
        System.out.println("Product Name: "+name+"\nProduct Price: "+price+"\nProduct Quantity: "+quantity);
    }
}
