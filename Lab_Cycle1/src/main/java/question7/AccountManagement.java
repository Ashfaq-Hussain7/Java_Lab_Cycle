/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question7;

/**
 *
 * @author ashfa
 */
import java.util.Scanner;

abstract class Account {
    protected String acc_holdername;
    protected String acc_number;
    protected double balance;

    public Account(String acc_holdername, String acc_number, double balance) {
        this.acc_holdername = acc_holdername;
        this.acc_number = acc_number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
            display_balance();
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }

    public abstract void withdrawal(double amount);

    public void display_balance() {
        System.out.println("Account Holder Name: " + acc_holdername);
        System.out.println("Account Number: " + acc_number);
        System.out.println("Available Balance: " + balance);
    }
}

class SavingAccount extends Account {
    private final double MINIMUM_BALANCE = 1000;

    public SavingAccount(String acc_holdername, String acc_number, double balance) {
        super(acc_holdername, acc_number, balance);
    }

    @Override
    public void withdrawal(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance-= amount;
            System.out.println("Amount withdrawn successfully.");
            display_balance();
        } else {
            System.out.println("Withdrawal amount exceeds the minimum balance requirement.");
        }
    }
}

class CurrentAccount extends Account {
    private final double OVERDRAFT_LIMIT = 0.05;

    public CurrentAccount(String acc_holdername, String acc_number, double balance) {
        super(acc_holdername, acc_number, balance);
    }

 
    @Override
    public void withdrawal(double amount) {
        double overdraftAmount = balance * OVERDRAFT_LIMIT;
        if (balance+ overdraftAmount >= amount) {
            balance-= amount;
            System.out.println("Amount withdrawn successfully.");
            display_balance();
        } else {
            System.out.println("Withdrawal amount exceeds the overdraft limit.");
        }
    }
}

public class AccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Account Management System!");

        // Create a Saving Account and a Current Account
        Account savingAccount = new SavingAccount("Ashfaq Hussain", "12356", 5000);
        Account currentAccount = new CurrentAccount("Adeeb Khalid", "789456", 10000);

        int choice;
        double amount;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit to Saving Account");
            System.out.println("2. Withdraw from Saving Account");
            System.out.println("3. Deposit to Current Account");
            System.out.println("4. Withdraw from Current Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount for Saving Account: ");
                    amount = scanner.nextDouble();
                    savingAccount.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount from Saving Account: ");
                    amount = scanner.nextDouble();
                    savingAccount.withdrawal(amount);
                    break;
                case 3:
                    System.out.print("Enter the deposit amount for Current Account: ");
                    amount = scanner.nextDouble();
                    currentAccount.deposit(amount);
                    break;
                case 4:
                    System.out.print("Enter the withdrawal amount from Current Account: ");
                    amount = scanner.nextDouble();
                    currentAccount.withdrawal(amount);
                    break;
                case 5:
                    System.out.println("Thank you!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

