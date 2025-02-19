import java.util.Scanner;

public class Main {
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter our name: ");
        String s1 = sc.nextLine();
        System.out.println("Please give your Bank Balance: ");
        double d1 = sc.nextDouble();
        BankAccount ba = new BankAccount();

        ba.setAccountNumber(s1);
        ba.setBalance(d1);

        ba.diplayBankAccount();
    }
}
