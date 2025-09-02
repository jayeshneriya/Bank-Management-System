import java.util.*;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void createAccount(Account acc) {
        accounts.put(acc.getAccountNumber(), acc);
        System.out.println("Account created successfully.");
    }

    public void deposit(String accNo, double amount) {
        Account acc = accounts.get(accNo);
        if (acc != null) {
            acc.deposit(amount);
            transactions.add(new Transaction(accNo, "Deposit", amount));
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accNo, double amount) {
        Account acc = accounts.get(accNo);
        if (acc != null) {
            acc.withdraw(amount);
            transactions.add(new Transaction(accNo, "Withdrawal", amount));
        } else {
            System.out.println("Account not found.");
        }
    }

    public void showAccount(String accNo) {
        Account acc = accounts.get(accNo);
        if (acc != null) acc.display();
        else System.out.println("Account not found.");
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
