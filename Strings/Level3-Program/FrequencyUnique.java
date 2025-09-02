import java.util.*;

class FrequencyUnique {
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
        int[] count = new int[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            int pos = -1;
            for (int j = 0; j < index; j++) {
                if (unique[j] == str.charAt(i)) {
                    pos = j;
                    break;
                }
            }
            if (pos == -1) {
                unique[index] = str.charAt(i);
                count[index] = 1;
                index++;
            } else {
                count[pos]++;
            }
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < index; i++) {
            System.out.println(unique[i] + " -> " + count[i]);
        }
    }
}