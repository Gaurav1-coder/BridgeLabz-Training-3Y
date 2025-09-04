package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class BankClass {
     public int accountNumber;     // public
    protected String accountHolder; // protected
    private double balance;       // private

    BankClass(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // public methods to access balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (balance >= amt) balance -= amt;
        else System.out.println("Insufficient balance!");
    }

    void showAccount() {
        System.out.println("Acc No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}
