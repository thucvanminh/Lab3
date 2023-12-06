package testpackk;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AccountManager {

    public ArrayList<Account> listAccounts;
    Scanner sc = new Scanner(System.in);

    public AccountManager() {
        this.listAccounts = new ArrayList<Account>();
    }

    public void addAccount(Scanner sc) {
        System.out.println("Enter your account name: ");
        String name = sc.nextLine();
        System.out.println("Enter innitial balance: ");
        float bala = Float.parseFloat(sc.nextLine());
        Random rd = new Random();
        int accID = rd.nextInt(99999 - 10000 + 1) + 10000;
        System.out.println("Your account ID is: " + accID);
        Account acc1 = new Account(name, accID, bala);
        this.listAccounts.add(acc1);
    }
   

    public void displayAccount() {
        System.out.println("Enter your account ID: ");
        int accID = sc.nextInt();
        for (Account acc : listAccounts) {
            if (acc.getId() == accID) {
                acc.showInfo();
                return;
            }
        }
        System.out.println("Cannot find a suitable account");
    }

    public void findAccountByID() {
        System.out.println("Enter your account ID: ");
        int accID = sc.nextInt();
        for (Account acc : listAccounts) {
            if (acc.getId() == accID) {
                acc.showInfo();
                return;
            }
        }
        System.out.println("Cannot find a suitable account");
    }

    public void doDepositAccount() {

        System.out.println("Enter account ID");
        int accID = sc.nextInt();
        for (Account acc : listAccounts) {
            if (accID == acc.getId()) {
                acc.balance=acc.deposit(sc);
                return;
            }
        }
        System.out.println("Cannot find account with that ID");
    }

    public void doWithdrawAccount() {
        System.out.println("Enter the account ID: ");
        int accID = sc.nextInt();
        for (Account acc : listAccounts) {
            if (accID == acc.getId()) {
                 acc.balance=acc.withdraw(sc);
                return;
            }
        }
        System.out.println("Cannot find account with that ID");

    }

    public void doProgram(Scanner sc) {
        int command = printMenu();
        while (command > 0 && command < 6) {
            if (command == 1) {
                addAccount(sc);
            }
            if (command == 2) {
                displayAccount();
            }
            if (command == 3) {
                displayAccount();
            }
            if (command == 4) {
                doDepositAccount();
            }
            if (command == 5) {
                doWithdrawAccount();
            }

            command = printMenu();
           
        }
    }

    public int printMenu() {

        System.out.println("\n1. Create Account");
        System.out.println("2. Display Account Information");
        System.out.println("3. Find Account by ID");
        System.out.println("4. Deposit Money");
        System.out.println("5. Withdraw Money");
        System.out.println("6. Exit");

        return sc.nextInt();
    }
}
