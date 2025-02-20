import java.util.Scanner;

public class Main {
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Product Name: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the Product Price: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter the Product Quantity: ");
        int i1 = sc.nextInt();

        Product p = new Product();

        p.setName(s1);
        p.setPrice(d1);
        p.setQuantity(i1);

        p.displayProduct();
    }
}
