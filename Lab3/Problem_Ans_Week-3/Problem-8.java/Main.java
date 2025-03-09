public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 5000.0);

        account.displayBankAccount();

        account.deposit(1500);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(2000);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(5000);
    }

}
