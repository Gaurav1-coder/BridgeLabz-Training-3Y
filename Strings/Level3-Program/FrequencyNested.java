import java.util.*;

class FrequencyNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] == '0') continue;
            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0'; 
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
}