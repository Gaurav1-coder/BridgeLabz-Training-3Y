import java.util.*;

public class NumberChecker3 {

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

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) return true; 
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);

        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Reversed Digits Array: " + Arrays.toString(reverseDigits(digits)));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
}
