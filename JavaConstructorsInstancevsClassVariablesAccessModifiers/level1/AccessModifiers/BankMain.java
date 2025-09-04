package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class BankMain {
     public static void main(String[] args) {
        BankClass ba = new BankClass(10101, "Ravi", 10000);
        ba.showAccount();
        ba.deposit(5000);
        ba.withdraw(3000);
        System.out.println("Balance: " + ba.getBalance());

        SavingsSubClass sa = new SavingsSubClass(20202, "Amit", 20000, 5.5);
        sa.showSavings();
    }
}
