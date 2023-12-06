package problem2;

import jdk.dynalink.linker.ConversionComparator;

public class Account {

    public float balance;
    private static final float MIN_DEPOSIT = 10;

    public Account(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean deposit(float amount) {
        if (amount <= MIN_DEPOSIT) {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

    public boolean withdraw(float amount) {
        if (amount > this.balance || amount < 0) {
            return false;
        } else {
            this.setBalance(this.getBalance() - amount);
            return true;
        }
    }

    public void showBalance() {
        System.out.println("Your balance is: " + this.balance);
    }

    public boolean equals(Account acc) {
        
        return true;
    }

}
