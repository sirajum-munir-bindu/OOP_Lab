public class Item {
    private String itemid;
    private String name;
    private double price;

    public Item(String itemid , String name , double price){
        this.itemid = itemid;
        this.name= name;
        this.price = price;
    }

    public void displayItem()
    {
        System.out.println("Item id: " +itemid+" Item name: "+name+" Price : "+price);
    }
}
