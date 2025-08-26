import java.util.Scanner;

public class StringLengthDemo {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int userDefinedLength = getLength(text);
        int builtInLength = text.length();

        System.out.println("\nUser-defined length: " + userDefinedLength);
        System.out.println("Built-in length(): " + builtInLength);

        sc.close();
    }
}
