import java.util.*;

class NumberFormatDemo {
    public static void generateException(String str) {
        int num = Integer.parseInt(str);
        System.out.println("Number: " + num);
    }

    public static void handleException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        handleException(str);
    }
}