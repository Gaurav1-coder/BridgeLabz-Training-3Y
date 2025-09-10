// package  ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class BankMain{
 public static void main(String[] args) {
        BankClass account1 = new BankClass("Lynda", "ACC101", 1000);
        BankClass account2 = new BankClass("Prince", "ACC102", 500);

        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();

        BankClass.getTotalAccounts();
    }
}