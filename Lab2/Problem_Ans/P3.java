import java.util.*;

public class BankAccount
{
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    private int withdraw;
    private int currentBalance;
    public BankAccount(int accountNumber , String accountHolderName , int balance , int withdraw , int currentBalance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.withdraw = withdraw;
        this.currentBalance = currentBalance;
    }

    public void displayDeposit()
    {
        System.out.println("The Deposit ammoint is : " +balance);
    }

    public void displayWithdraw()
    {
        System.out.println("The Withdraw ammount is= " +withdraw);
    }

    public void displayCurrentBalance()
    {
        System.out.println("The total balance is = " +currentBalance);
    }

    public static void main(String[] y){
        Scanner sc= new Scanner(System.in);
        int a , c , d , e;
        String b;
        System.out.print("Enter the account Number = ");
        a =sc.nextInt();

        System.out.print("Enter the account Holde Name = ");
        b =sc.next();

        System.out.print("Enter the Balance ammount = ");
        c =sc.nextInt();

        System.out.print("Enter the Withdraw = ");
        d =sc.nextInt();

        e = c - d;

        BankAccount x = new BankAccount(a , b , c , d , e);
        x.displayDeposit();
        x.displayWithdraw();
        x.displayCurrentBalance();
    }
}
