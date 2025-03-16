public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500); // Account with opening balance
        BankAccount account2 = new BankAccount(); // Account with default balance

        account1.displayBalance();
        account1.deposit(200);
        account1.withdraw(100);
        account1.displayBalance();

        account2.displayBalance();
        account2.deposit(300);
        account2.withdraw(150);
        account2.displayBalance();
    }
}
