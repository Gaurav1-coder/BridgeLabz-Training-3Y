import java.util.Scanner;

public class LowerCaseCompare {

    public static String convertToLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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

        String userDefinedLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        boolean result = compareUsingCharAt(userDefinedLower, builtInLower);

        System.out.println("\nUser-defined lowercase: " + userDefinedLower);
        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Comparison result: " + result);

        sc.close();
    }
}
