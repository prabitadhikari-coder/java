public class Account {
    private int accountNumber;
    protected double balance;
    @SuppressWarnings("unused")
    private double w;
    @SuppressWarnings("unused")
    private double annualInterestRate;
    
    public Account(int accountNumber, double initialBalance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.annualInterestRate = annualInterestRate;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of $" + amount);
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
}