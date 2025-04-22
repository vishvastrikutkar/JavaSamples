/*
OOP Design: Bank Account
Implement a BankAccount class with features such as deposit, withdraw, and balance check using encapsulation and constructors.

 */
package UKG.Day1;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    // Initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Get Balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        bankOperations(new BankAccount(1000));
    }

    public static void bankOperations(BankAccount account)
    {
        System.out.println("Welcome to the Bank Account");
        System.out.println("Initial Balance: " + account.getBalance());
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println("Please enter choice: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("Enter the amount to deposit: ");
                    account.deposit(scanner.nextDouble());
                }
                case 2 -> {
                    System.out.println("Enter the amount to withdraw: ");
                    account.withdraw(scanner.nextDouble());
                }
                case 3 -> System.out.println("Current balance: " + account.getBalance());
                case 4 -> flag = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}