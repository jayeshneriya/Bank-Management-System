public abstract class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    public void display() {
        System.out.println("Account: " + accountNumber + ", Name: " + holderName + ", Balance: ₹" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
