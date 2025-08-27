import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Card Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Card Number (last 4 digits): ");
        int cardNo = sc.nextInt();

        
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        int[] transactions = new int[n];
        int balance = 0;
        int totalDeposit = 0;
        int totalWithdraw = 0;

        System.out.println("\nEnter transactions (positive = deposit, negative = withdraw):");
        for (int i = 0; i < n; i++) {
            System.out.print("Transaction " + (i + 1) + ": ");
            transactions[i] = sc.nextInt();
        }

        System.out.println("\n----- Transaction Details -----");

        for (int t : transactions) {
            if (t > 0) { // Deposit
                balance += t;
                totalDeposit += t;
                System.out.println("Deposited: " + t + " | Current Balance: " + balance);
            } else { // Withdrawal
                balance += t; // t already negative
                totalWithdraw += (-t);
                System.out.println("Withdrawn: " + (-t) + " | Current Balance: " + balance);
            }
        }

        System.out.println("\n----- Final Report -----");
        System.out.println("Card Holder: " + name);
        System.out.println("Card No.: XXXX-XXXX-XXXX-" + cardNo);
        System.out.println("Total Deposit: " + totalDeposit);
        System.out.println("Total Withdraw: " + totalWithdraw);
        System.out.println("Final Balance: " + balance);

        if (balance < 0) {
            System.out.println("⚠ Alert: Account is in Overdraft!");
        } else {
            System.out.println("✅ Account is in Good Standing.");
        }

        sc.close();
    }
}