
package testpackk;


import java.util.Scanner;


public class Account {
    
    Scanner sc = new Scanner(System.in);
    public String accountName;
    public int accountID;
    public float balance;

    public Account(String accountName, int accountID, float balance) {
        this.accountName = accountName;
        this.accountID = accountID;
        this.balance = balance;
    }
    

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    public float deposit(Scanner sc){
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt(); 
        if(amount<=0){
            System.out.println("Unsuccesful");
            return this.balance;
        }
        else {
            System.out.println("Succesful");
            return this.balance+amount;
        }
    }
    
    public float withdraw (Scanner sc){
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        if(amount<0||amount>this.balance){
            System.out.println("Unsuccessful");
            return this.balance;
        }
        else {
            System.out.println("Successful");
            return this.balance-amount;
        }
    }
    public void showBalance(){
        System.out.println("Your balance is: "+this.balance);
    }
    public int getId(){
        return accountID;
    }
    public void showInfo(){
        System.out.print("Your account name is: "+this.accountName+" and has "+this.balance);
    }
    
}
