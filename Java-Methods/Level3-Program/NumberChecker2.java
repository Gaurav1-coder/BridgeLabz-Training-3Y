import java.util.*;

public class NumberChecker2 {

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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; 
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; 
            freq[i][1] = 0; 
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);

        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1] + " times");
            }
        }
    }
}

