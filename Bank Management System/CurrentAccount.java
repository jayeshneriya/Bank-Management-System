public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = -10000;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
