import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Define the Account class within the same file for simplicity.
        class Account {
            private String name;
            private double balance;

            public Account(String name, double balance) {
                this.name = name;
                if (balance >= 0.0) {
                    this.balance = balance;
                } else {
                    System.out.println("Error: Initial balance cannot be negative.");
                }
            }

            public void deposit(double depositAmount) {
                if (depositAmount > 0.0) {
                    balance += depositAmount;
                } else {
                    System.out.println("Error: Deposit amount must be positive.");
                }
            }

            public double getBalance() {
                return balance;
            }

            public String getName() {
                return name;
            }
        }

        // Now you can use the Account class within the same file.

        Account account1 = new Account("John Green", 50.00);
        Account account2 = new Account("John Blue", 20.00);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();

        System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();

        System.out.printf("%nAdding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        input.close();
    }
}
