
package testpack;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
     private String name;
    private double balance;
    private int accountNumber;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = this.hashCode();
    }

    public void displayAccountInfo() {
        System.out.println("Account Name: " + this.name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + ". New balance is " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance is " + this.balance);
        }
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}

class Menu {
    private ArrayList<Account> accounts;

    public Menu() {
        this.accounts = new ArrayList<Account>();
    }

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        Account account = new Account(name, balance);
        this.accounts.add(account);
        System.out.println("Account created with account number " + account.getAccountNumber());
    }

    public void displayAccountInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.displayAccountInfo();
                return;
            }
        }
        System.out.println("Account not found");
    }

    public Account findAccountById(int id) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == id) {
                return account;
            }
        }
        return null;
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter account number: ");
        int id = scanner.nextInt();
        Account account = findAccountById(id);
        if (account != null) {
            account.deposit(amount);
            return;
        }
        System.out.println("Account not found");
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter account number: ");
        int id = scanner.nextInt();
        Account account = findAccountById(id);
        if (account != null) {
            account.withdraw(amount);
            return;
        }
        System.out.println("Account not found");
    }
}
