import java.util.*;

public class NumberChecker {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);

        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
