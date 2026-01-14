public class SavingsAccount extends Account {
    
    public SavingsAccount(int accountNumber, double initialBalance, double annualInterestRate) {
        super(accountNumber, initialBalance, annualInterestRate);
    }
    
    // No overdraft allowed for savings account
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Cannot withdraw $" + amount + ". Insufficient funds!");
        }
    }
}
