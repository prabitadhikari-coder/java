public class CheckingAccount extends Account {
    private double overdraftLimit;
    
    public CheckingAccount(int accountNumber, double initialBalance, 
                          double annualInterestRate, double overdraftLimit) {
        super(accountNumber, initialBalance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Withdrawal of $" + amount + " exceeds overdraft limit!");
        }
    }
    
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}