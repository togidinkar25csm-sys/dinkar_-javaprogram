package crits;

class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;
    protected String accountType;

    // Constructor to initialize account details
    Account(String accountNumber, String holderName,
            double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
            return true;
        }
        System.out.println("Insufficient balance.");
        return false;
    }

    // Transfer money to another account
    public void transfer(Account target, double amount) {
        if (withdraw(amount)) {
            target.deposit(amount);
            System.out.println("Transferred: Rs." + amount
                    + " to " + target.accountNumber);
        } else {
            System.out.println("Transfer failed.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Account Type   : " + accountType);
        System.out.printf("Balance        : Rs.%.2f%n", balance);
    }
}


// Savings Account class - inherits from Account
class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(String accountNumber, String holderName,
                   double balance, double interestRate) {
        super(accountNumber, holderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Calculate interest based on balance
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.printf("Interest        : Rs.%.2f%n", calculateInterest());
    }
}


// Current Account class - inherits from Account
class CurrentAccount extends Account {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, String holderName,
                   double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    // Overridden withdraw() - allows withdrawal up to overdraft limit
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
            return true;
        }
        System.out.println("Withdrawal exceeds overdraft limit.");
        return false;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.printf("Overdraft Limit: Rs.%.2f%n", overdraftLimit);
    }
}


// Main class
public class BankAccountObservationDemo {
    public static void main(String[] args) {

        // Creating objects
        SavingsAccount savings =
                new SavingsAccount("SA101", "Rahul", 10000, 5.0);

        CurrentAccount current =
                new CurrentAccount("CA201", "Priya", 15000, 5000);

        System.out.println("===== SAVINGS ACCOUNT (Before Transactions) =====");
        savings.displayAccountDetails();

        System.out.println("\n===== CURRENT ACCOUNT (Before Transactions) =====");
        current.displayAccountDetails();

        System.out.println("\nDepositing Rs.2000 into Savings...");
        savings.deposit(2000);

        System.out.println("\nWithdrawing Rs.1500 from Savings...");
        savings.withdraw(1500);

        System.out.println("\nWithdrawing Rs.18000 from Current (overdraft test)...");
        current.withdraw(18000);

        System.out.println("\nTransferring Rs.2000 from Savings to Current...");
        savings.transfer(current, 2000);

        System.out.println("\n===== SAVINGS ACCOUNT (After Transactions) =====");
        savings.displayAccountDetails();

        System.out.println("\n===== CURRENT ACCOUNT (After Transactions) =====");
        current.displayAccountDetails();

        System.out.println("\n===== FINAL BALANCES =====");
        System.out.printf("Savings Account Final Balance : Rs.%.2f%n", savings.balance);
        System.out.printf("Current Account Final Balance : Rs.%.2f%n", current.balance);
    }
}