import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. View Account\n5. Transactions\n6. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Initial Balance: ");
                    double bal = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Type (S/C): ");
                    String type = sc.nextLine();
                    if (type.equalsIgnoreCase("S")) {
                        bank.createAccount(new SavingsAccount(accNo, name, bal));
                    } else {
                        bank.createAccount(new CurrentAccount(accNo, name, bal));
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();
                    System.out.print("Amount to Deposit: ");
                    double dep = sc.nextDouble();
                    bank.deposit(accNo, dep);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();
                    System.out.print("Amount to Withdraw: ");
                    double wd = sc.nextDouble();
                    bank.withdraw(accNo, wd);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();
                    bank.showAccount(accNo);
                    break;

                case 5:
                    bank.showTransactions();
                    break;

                case 6:
                    exit = true;
                    break;
            }
        }
        sc.close();
    }
}



// javac *.java is used to run the program
