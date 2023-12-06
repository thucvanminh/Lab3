package problem_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AccountManager {

    public ArrayList<Account> listAccounts;
    public int numOfAccount;
    private static final int capacity = 100;

    public Scanner sc = new Scanner(System.in);

    public AccountManager() {
        this.listAccounts =  new ArrayList<Account>(this.capacity);
        this.numOfAccount = 0;

    }

    public ArrayList<Account> getListAccounts() {
        return listAccounts;
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setListAccounts(ArrayList<Account> listAccounts) {
        this.listAccounts = listAccounts;
    }

    public void setNumOfAccount(int numOfAccount) {
        this.numOfAccount = numOfAccount;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    

    public boolean addAccount(Account acc) {
        if(this.numOfAccount==this.capacity){
            return false;
        }
        else {
            this.numOfAccount=this.numOfAccount+1;
            this.listAccounts.add(acc);
            return true;
        }
         

    }
    public String getInput(String message){
        System.out.println(message);
        return sc.nextLine();
    }

    public ArrayList getlistAccount() {

        return listAccounts;
    }

    public Account findAccountByID(String id) {
        for (Account acc : listAccounts) {
            if (acc.getID().equals(id)) {
                return acc;
            }
        }
        System.out.println("Cannot find any account");
        return null;

    }

    public boolean depositAccount(String id, float amount) {
            return this.findAccountByID(id).deposit(amount);
        
    }

    public boolean withdrawAccount(String id, int amount) {
        return this.findAccountByID(id).withdraw(amount);
    }
    

}
