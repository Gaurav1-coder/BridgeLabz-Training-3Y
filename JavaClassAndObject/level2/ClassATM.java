package JavaClassAndObject.level2;


class ClassATM {
    String holder;
    int accNo;
    double balance;

    ClassATM(String holder, int accNo, double balance) {
        this.holder = holder;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance);
    }
}