import java.util.Scanner;

public class UpperCaseCompare {

    public static String convertToUpper(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String userDefinedUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        boolean result = compareUsingCharAt(userDefinedUpper, builtInUpper);

        System.out.println("\nUser-defined uppercase: " + userDefinedUpper);
        System.out.println("Built-in toUpperCase(): " + builtInUpper);
        System.out.println("Comparison result: " + result);

        sc.close();
    }
}
