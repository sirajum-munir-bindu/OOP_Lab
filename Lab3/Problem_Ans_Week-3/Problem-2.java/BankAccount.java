public class BankAccount {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setBalance(double balance)
    {
        if(balance > 0)
        {
            this.balance = balance;
        }
        else {
            System.out.println("Account Is not Response....");
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public void diplayBankAccount()
    {
        System.out.println("Account Number: "+accountNumber+"   Account Ballence: "+balance);
    }
}
