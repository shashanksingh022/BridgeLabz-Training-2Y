/*Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
 */

 class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account | Rate: " + interestRate);
    }

    @Override
    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance + ", Type: Savings, Rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account | WithdrawalLimit: " + withdrawalLimit);
    }

    @Override
    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance + ", Type: Checking, Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenureMonths;

    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account | Tenure: " + tenureMonths + " months");
    }

    @Override
    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance + ", Type: FD, Tenure: " + tenureMonths + " months");
    }
}

public class Q1 {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("SA-1001", 15000.0, 0.045);
        BankAccount a2 = a1;
        BankAccount a3 = new CheckingAccount("CA-2001", 8000.0, 20000.0);
        BankAccount a4 = new FixedDepositAccount("FD-3001", 100000.0, 12);

        ((SavingsAccount) a2).displayAccountType();
        ((CheckingAccount) a3).displayAccountType();
        ((FixedDepositAccount) a4).displayAccountType();

        BankAccount[] accounts = { a1, a3, a4 };
        for (BankAccount acc : accounts) {
            acc.displayDetails();
        }
    }
}
