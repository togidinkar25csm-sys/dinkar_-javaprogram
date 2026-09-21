package task1;

//Base class
class BankAccount {
 protected String accountNumber;
 protected String holderName;
 protected double balance;

 BankAccount(String accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 // Default interest rate - to be overridden
 public double calculateInterestRate() {
     return 2.0; // generic default rate (%)
 }

 // Applies interest using whichever calculateInterestRate() resolves at runtime
 public void applyInterest() {
     double rate = calculateInterestRate();
     double interest = balance * rate / 100;
     balance += interest;
     System.out.printf("Interest Rate Applied : %.2f%%%n", rate);
     System.out.printf("Interest Credited     : Rs.%.2f%n", interest);
 }

 public void displayDetails() {
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Holder Name    : " + holderName);
     System.out.printf("Balance        : Rs.%.2f%n", balance);
 }
}


//Savings Account - overrides interest rate
class SavingsAccount extends BankAccount {
 SavingsAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 @Override
 public double calculateInterestRate() {
     return 4.5; // higher fixed rate for savings
 }
}


//Fixed Deposit Account - overrides interest rate based on lock-in period
class FixedDepositAccount extends BankAccount {
 private int lockInYears;

 FixedDepositAccount(String accountNumber, String holderName, double balance, int lockInYears) {
     super(accountNumber, holderName, balance);
     this.lockInYears = lockInYears;
 }

 @Override
 public double calculateInterestRate() {
     if (lockInYears >= 5) {
         return 7.5;
     } else if (lockInYears >= 3) {
         return 6.5;
     } else {
         return 5.5;
     }
 }
}


//Current Account - overrides interest rate to zero
class CurrentAccount extends BankAccount {
 CurrentAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 @Override
 public double calculateInterestRate() {
     return 0.0; // current accounts earn no interest
 }
}


//Main class
public class BankOverrideDemo {
 public static void main(String[] args) {

     // Superclass references pointing to different subclass objects
     BankAccount[] accounts = {
         new SavingsAccount("SA101", "Rahul", 10000),
         new FixedDepositAccount("FD201", "Priya", 50000, 5),
         new CurrentAccount("CA301", "Vikram", 20000)
     };

     for (BankAccount acc : accounts) {
         System.out.println("===== " + acc.getClass().getSimpleName() + " =====");
         acc.displayDetails();
         acc.applyInterest(); // dynamic dispatch resolves correct overridden method
         System.out.println("----- After Interest -----");
         acc.displayDetails();
         System.out.println();
     }
 }
}