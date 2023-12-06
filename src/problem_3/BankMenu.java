package problem_3;

import java.util.Random;
import java.util.Scanner;

public class BankMenu {

    private AccountManager accountManager;
    public Scanner sc = new Scanner(System.in);

    public BankMenu() {
        this.accountManager = new AccountManager();
    }

    public int printMenu(Scanner sc) {
        System.out.println("1. Creat Account\n2. Show all account information\n3. Find account by ID\n4. Deposit\n5. Withdraw\n6. Exit");
        return sc.nextInt();
    }

    public void doTask() {
        int command = printMenu(sc);
        while (command > 0 && command < 6) {
            if (command == 1) {
                createAccount();
            } else if (command == 2) {
                doShowAllAccount();

            } else if (command == 3) {
                findAccountById();
            } else if (command == 4) {
                depositBank();

            } else if (command == 5) {
                withdrawBank();
            }
            command = printMenu(sc);

        }
        
    }

    private void withdrawBank() throws NumberFormatException {
        String accountID = this.accountManager.getInput("Enter your account's ID: ");
        float amount = Float.parseFloat(this.accountManager.getInput("Enter the withdraw amount"));
        boolean result = this.accountManager.depositAccount(accountID, amount);
         printResult(result,"Withdraw");
    }

    private void depositBank() throws NumberFormatException {
        String accountID = this.accountManager.getInput("Enter your account's ID: ");
        float amount = Float.parseFloat(this.accountManager.getInput("Enter the deposit amount"));
        boolean result = this.accountManager.depositAccount(accountID, amount);
        printResult(result,"Deposit");
    }

    private void printResult(boolean result,String message) {
        if(result){
            System.out.println(message+" succesfully");
        }
        else {
            System.out.println(message+" unsuccesfully");
        }
    }

    private void findAccountById() {
        String accID = this.accountManager.getInput("Enter your account's ID");
        Account acc = this.accountManager.findAccountByID(accID);
        System.out.println("Hello " + acc.accountName + "!  Your balancs is: " + acc.balance);
    }

    private void doShowAllAccount() {
        for (int i = 0; i < accountManager.numOfAccount; i++) {
            Account acc = this.accountManager.getListAccounts().get(i);
            printAllAccount(acc);
        }
    }

    private void printAllAccount(Account acc) {
        System.out.println("This is account number: " + (this.accountManager.getListAccounts().indexOf(acc) + 1));
        System.out.println("Account name is: " + acc.accountName);
        System.out.println("Account ID is: " + acc.accountID);
        System.out.println("Account's balance is: " + acc.balance + "\n");
    }

    private void createAccount() throws NumberFormatException {
        String name = this.accountManager.getInput("Enter your account's name: ");
        float amount = Float.parseFloat(this.accountManager.getInput("Enter the initial balance"));
        
        Random rd = new Random();
        String accountID = String.valueOf(rd.nextInt(99999 - 10000 + 1) + 10000);
        Account newAccount = new Account((int)amount, accountID, name);
        boolean result = this.accountManager.addAccount(newAccount);
        resultAccount(result, accountID);
    }

    private void resultAccount(boolean result, String accountID) {
        if(result){
            System.out.println("Your account is created succesfully with ID: "+accountID+"\n");
        }
        else {
            System.out.println("No valid slot in Bank. Try again next time");
        }
    }

    public String getInput(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

}
