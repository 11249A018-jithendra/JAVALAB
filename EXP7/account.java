Aim
To write a Java program to demonstrate inheritance by creating an Account class and a derived SBAccount class to perform credit and debit operations, display the balance, and display the interest rate.

Algorithm
Start the program.
Create a class Account with variables accountNumber and balance.
Define a constructor to initialize the account number and balance.
Define the credit() method to add an amount to the balance.
Define the debit() method to subtract an amount from the balance.
Define the displayBalance() method to display the current balance.
Create a class SBAccount that extends the Account class.
Declare a variable rate to store the interest rate and initialize it using the constructor with the help of super().
Define the displayInterestRate() method to display the interest rate.
In the main() method, create an object of SBAccount with account number 1001, balance 5000, and interest rate 6.5.
Credit ₹2000 and debit ₹1000 from the account.
Display the updated balance and interest rate.
Stop the program.

//program:
import java.io.*;
class Account {
    int accountNumber, balance;
    Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void credit(int amount) {
        balance = balance + amount;
    }
    void debit(int amount) {
        balance = balance - amount;
    }
    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}
class SBAccount extends Account {
    double rate;
    SBAccount(int accountNumber, int balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;
    }
    void displayInterestRate() {
        System.out.println("Interest Rate = " + rate);
    }
}
public class AccountDemo {
    public static void main(String[] args) {
        SBAccount obj1 = new SBAccount(1001, 5000, 6.5);
        obj1.credit(2000);
        obj1.debit(1000);
        obj1.displayBalance();
        obj1.displayInterestRate();
    }
}




//Result
Thus, the Java program to demonstrate inheritance using the Account and SBAccount classes and to perform credit and debit operations was executed successfully.