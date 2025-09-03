package JavaClassAndObject.level2;

import java.util.Scanner;

public class PalindromeMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = sc.nextLine();

        ClassPalindrome p1 = new ClassPalindrome(str);
        p1.display();

        sc.close();
    }
}
