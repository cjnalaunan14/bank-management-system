package SimpleBankSystem;

import java.util.*;

public class Choice {

    public void displayChoice() {
        Scanner scan = new Scanner(System.in);
        Balance balance = new Balance();

        Boolean loop = true;
        while (loop) {
        	System.out.println("ATM MACHINE");
            System.out.println("[1] Check Balance \n[2] Withdraw \n[3] Deposit\n[4] Exit");
            System.out.print("Enter your choice: ");
            String choice = scan.next();

            switch (choice) {
                case "1":
                    System.out.println("\nYou selected: Check Balance!");
                    balance.checkBalance();
                    break;
                case "2":
                    System.out.println("\nYou selected: Withdraw!");
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scan.nextDouble();
                    balance.withdrawUser(withdraw);
                    break;
                case "3":
                    System.out.println("\nYou selected: Deposit!");
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scan.nextDouble();
                    balance.depositUser(deposit);
                    break;
                case "4":
                    System.out.println("\nYou selected: Exit!");
                    loop = false;
                    break;
                default:
                    System.out.println("\nInvalid Input!");
                    continue;
            }

            if (loop) {
                System.out.print("Do you want another transaction? (y/n): ");
                String again = scan.next();
                if (!again.equalsIgnoreCase("y")) {
                    loop = false;
                }
            }
        }
        scan.close();
    }
}