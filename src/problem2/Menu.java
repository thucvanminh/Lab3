package problem2;

import java.util.Scanner;

public class Menu {

    public Account acc;
    Scanner sc = new Scanner(System.in);

    public Menu(Account acc) {
        this.acc = acc;
    }

    public void doTask() {
        int command = printMenu(sc);
        while (command > 0 && command < 4) {
            switch (command) {
                case 1:
                    doShowBalance();
                    break;
                case 2:
                    doDeposit();
                    break;
                case 3:
                    doWithdraw();
                    break;
                default:
                    break;
            }
            command = printMenu(sc);
        }

    }

    public int printMenu(Scanner sc) {
        System.out.println("1. Show Balance\n2. Deposit\n3. Withdraw \n4. Exit\n What do you want?\n");
        return sc.nextInt();
    }

    public void doShowBalance() {
        this.acc.showBalance();
    }

    public void doDeposit() {
        float amount = getInput("Please enter deposit amount");
        boolean result = this.acc.deposit(amount);
        doPrintResult(result,"Deposit");
    }
    
    public void doWithdraw() {
        float amount = getInput("Please enter withdraw amount");
        boolean result = this.acc.withdraw(amount);
        doPrintResult(result,"Withdraw");
    }
    
    public void doPrintResult(boolean result,String message) {
        if(result){
            System.out.println(message+" Successfully");
        }
        else {
            System.out.println(message+" Unsuccessfully");
        }
    }

    public float getInput(String message) {
        System.out.print(message);
        float amount = sc.nextFloat();
        return amount;
    }
    

}
