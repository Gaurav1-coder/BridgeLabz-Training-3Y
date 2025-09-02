import java.util.*;

class IllegalArgumentDemo {
    public static void generateException(String str) {
        System.out.println(str.substring(5, 2));
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        handleException(str);
    }
}