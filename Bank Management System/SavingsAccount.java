public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient funds (Min balance: ₹500)");
        }
    }
}
