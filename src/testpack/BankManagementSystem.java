
package testpack;

import java.util.Scanner;


public class BankManagementSystem {
    public static void main(String[] args) {

      Menu menu = new Menu();

      while (true) {

          System.out.println("\n1. Create Account");
          System.out.println("2. Display Account Information");
          System.out.println("3. Find Account by ID");
          System.out.println("4. Deposit Money");
          System.out.println("5. Withdraw Money");
          System.out.println("6. Exit");

          Scanner scanner = new Scanner(System.in);

          System.out.print("\nEnter your choice: ");
          int choice = scanner.nextInt();

          switch (choice) {

              case 1:
                  menu.createAccount();
                  break;

              case 2:
                  menu.displayAccountInfo();
                  break;

              case 3:
                  menu.displayAccountInfo();
                  break;

              case 4:
                  menu.deposit();
                  break;

              case 5:
                  menu.withdraw();
                  break;

              case 6:
                  return;

              default:
                  System.out.println("\nInvalid choice. Please try again.");
          }
      }
  }
}
