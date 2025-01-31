import java.util.Scanner;

public class Main {
    // ----------------Question----------------------//
    /* Customer buy Item. Customer is identified by custid , name and email.
    Item is identified by itemid , name , price. Customer buy on a data and with
    specific quality */

    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the customer id: ");
        String cid = sc.nextLine();


        System.out.print("Enter the customer Name: ");
        String cn = sc.nextLine();


        System.out.print("Enter the customer E-mail: ");
        String cem = sc.nextLine();


        System.out.print("Enter the Item id: ");
        String iid = sc.nextLine();


        System.out.print("Enter the Item Name: ");
        String in = sc.nextLine();


        System.out.print("Enter the Item Price: ");
        double ip = sc.nextDouble();

        System.out.print("Give Buing date: ");
        sc.nextLine();
        String bdate = sc.nextLine();

        
        System.out.print("Give Buing Quantity: ");
        String bq = sc.nextLine();


        Customer cu = new Customer(cid , cn , cem);
        Item it = new Item(iid , in , ip);
        Buy b = new Buy(cu , it , bdate , bq);

        b.displayBuy();
    }
}
