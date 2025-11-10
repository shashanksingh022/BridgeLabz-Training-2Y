/*Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
Static:
○       A static variable bankName is shared across all accounts.
○       A static method getTotalAccounts() to display the total number of accounts.
This:
○       Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
○       Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
○       Check if an account object is an instance of the BankAccount class before displaying its details.
 */

 class BankAccount {
    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited. New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn. New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Not a valid BankAccount object!");
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
        System.out.println("=============================");
    }
}

class Q1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Kartik", 10101, 5000);
        BankAccount b2 = new BankAccount("Aman", 20202, 10000);

        b1.displayAccountDetails();
        b2.displayAccountDetails();

        b1.deposit(2000);
        b2.withdraw(3000);

        BankAccount.getTotalAccounts();
    }
}
