import java.util.Scanner;

public class VowelConsonantCount {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);  
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        int i = 0;
        try {
            while (true) {
                char ch = str.charAt(i);
                String type = checkCharType(ch);

                if (type.equals("Vowel")) vowels++;
                else if (type.equals("Consonant")) consonants++;

                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsAndConsonants(input);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}
