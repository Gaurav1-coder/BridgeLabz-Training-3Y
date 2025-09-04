package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class SavingsSubClass extends BankClass {
    double interestRate;

    SavingsSubClass(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void showSavings() {
        // accessing public accountNumber & protected accountHolder
        System.out.println("Savings Account: " + accountNumber + ", Holder: " + accountHolder + ", Rate: " + interestRate + "%");
    }
}
