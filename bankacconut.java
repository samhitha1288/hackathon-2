import java.util.Scanner;

class BankAccount {
String accountNumber;
String accountHolderName;
double balance;

// Parameterized constructor
BankAccount(String accountNumber, String accountHolderName, double balance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
}

// Deposit money
void deposit(double amount) {
balance = balance + amount;
}

// Withdraw money
void withdraw(double amount) {
if (amount <= balance) {
balance = balance - amount;
} else {
System.out.println("Insufficient balance");
}
}

// Check balance
double checkBalance() {
return balance;
}

// Display account details
void displayAccount() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder Name: " + accountHolderName);
System.out.println("Balance: " + balance);
}
}

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Read account details
System.out.print("Enter account number: ");
String accountNumber = sc.nextLine();

System.out.print("Enter account holder name: ");
String accountHolderName = sc.nextLine();

System.out.print("Enter initial balance: ");
double balance = sc.nextDouble();

// Create object using parameterized constructor
BankAccount account = new BankAccount(
accountNumber,
accountHolderName,
balance
);

// Deposit
System.out.print("Enter deposit amount: ");
double depositAmount = sc.nextDouble();
account.deposit(depositAmount);

// Withdraw
System.out.print("Enter withdrawal amount: ");
double withdrawAmount = sc.nextDouble();
account.withdraw(withdrawAmount);

// Display final details
System.out.println("\nFinal Account Details:");
account.displayAccount();


}
}

