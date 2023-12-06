package problem_3;

public class Account {

    public float balance;
    public String accountID;
    public String accountName;

    public Account(float balance, String accountID, String accountName) {
        this.balance = balance;
        this.accountID = accountID;
        this.accountName = accountName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean deposit(float amount) {
        if (amount <= 0) {
            return false;
        } else {
            this.setBalance(this.getBalance()+amount);
            return true;
        }
    }

    public boolean withdraw(float amount) {
        if (amount >= this.balance && amount < 0) {
            return false;
        } else {
            this.setBalance(this.getBalance()-amount);
            return true;
        }
    }

    public void showBalance() {
        System.out.println("Your balance is: " + this.balance);
    }

    public String getID() {
        return accountID;
    }
    public void showInfo(){
        System.out.print("Your account name is: "+this.accountName+" and has "+this.balance);
    }

}
