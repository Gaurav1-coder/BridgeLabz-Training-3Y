import java.util.*;

class PalindromeChecker {
    static boolean isPalindrome1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindrome2(s, i + 1, j - 1);
    }

    static boolean isPalindrome3(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Loop check: " + isPalindrome1(str));
        System.out.println("Recursive check: " + isPalindrome2(str, 0, str.length() - 1));
        System.out.println("Reverse check: " + isPalindrome3(str));
    }
}