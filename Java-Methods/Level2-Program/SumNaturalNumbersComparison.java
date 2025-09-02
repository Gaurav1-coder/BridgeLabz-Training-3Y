import java.util.Scanner;

public class SumNaturalNumbersComparison {

    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sumRecursive = recursiveSum(n);
            int sumFormula = formulaSum(n);

            System.out.println("Sum using recursion = " + sumRecursive);
            System.out.println("Sum using formula = " + sumFormula);

            if (sumRecursive == sumFormula) {
                System.out.println(" Both computations match. The result is correct!");
            } else {
                System.out.println(" Results do not match.");
            }
        }

        sc.close();
    }
}
