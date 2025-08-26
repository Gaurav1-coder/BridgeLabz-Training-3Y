import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getChars(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userDefinedChars = getChars(text);
        char[] builtInChars = text.toCharArray();

        boolean result = compareArrays(userDefinedChars, builtInChars);

        System.out.print("\nUser-defined method result: ");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in toCharArray() result: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nComparison result: " + result);

        sc.close();
    }
}
