import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("\nResults:");
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " is Positive and Even");
                } else {
                    System.out.println(n + " is Positive and Odd");
                }
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println(n + " is Zero");
            }
        }

        System.out.println("\nComparison of first and last elements:");
        if (nums[0] == nums[nums.length - 1]) {
            System.out.println("First and Last elements are Equal");
        } else if (nums[0] > nums[nums.length - 1]) {
            System.out.println("First element is Greater than Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }

        sc.close();
    }
}
