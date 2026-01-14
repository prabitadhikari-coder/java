public class TestAccount {
    public static void main(String[] args) {
        // Test Checking Account
        System.out.println("=== Checking Account Test ===");
        CheckingAccount checking = new CheckingAccount(1001, 500.0, 1.5, 200.0);
        checking.deposit(200.0);
        checking.withdraw(400.0);  // Should succeed
        checking.withdraw(500.0);  // Should exceed overdraft limit
        
        System.out.println("\n=== Savings Account Test ===");
        SavingsAccount savings = new SavingsAccount(2001, 300.0, 2.5);
        savings.deposit(100.0);
        savings.withdraw(350.0);  // Should succeed
        savings.withdraw(200.0);  // Should fail - insufficient funds
    }
}
