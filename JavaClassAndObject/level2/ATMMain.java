package JavaClassAndObject.level2;

import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder: ");
        String holder = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        ClassATM b1 = new ClassATM(holder, accNo, bal);

        System.out.print("Enter Deposit Amount: ");
        b1.deposit(sc.nextDouble());

        System.out.print("Enter Withdraw Amount: ");
        b1.withdraw(sc.nextDouble());

        b1.displayBalance();

        sc.close();
    }
}
