/*Problem 3: Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder. */

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
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
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
        System.out.println("-----------------------------");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Savings Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-----------------------------");
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(10101, "Kartik", 5000);
        b1.displayAccountDetails();
        b1.deposit(2000);
        b1.withdraw(3000);
        System.out.println();

        SavingsAccount s1 = new SavingsAccount(20202, "Aman", 10000, 4.5);
        s1.displaySavingsDetails();
        s1.deposit(5000);
        s1.withdraw(12000);
    }
}
