import java.util.*;

class UniqueChars {
    static int findLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {
            return len;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len = findLength(str);
        char[] unique = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (str.charAt(i) == unique[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[index++] = str.charAt(i);
            }
        }

        System.out.print("Unique characters: ");
        for (int i = 0; i < index; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}