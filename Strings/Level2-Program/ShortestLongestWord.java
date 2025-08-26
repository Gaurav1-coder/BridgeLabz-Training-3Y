import java.util.Scanner;

public class ShortestLongestWord {

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

    public static String[] splitUsingCharAt(String text) {
        int length = getLength(text);

        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 2];
        spaceIndexes[0] = -1;
        int idx = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = length;

        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] wordTable) {
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < wordTable.length; i++) {
            int length = Integer.parseInt(wordTable[i][1]);
            if (length < Integer.parseInt(wordTable[minIndex][1])) {
                minIndex = i;
            }
            if (length > Integer.parseInt(wordTable[maxIndex][1])) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] wordTable = wordsWithLength(words);
        int[] indexes = findShortestLongest(wordTable);

        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordTable.length; i++) {
            System.out.println(wordTable[i][0] + "\t" + Integer.parseInt(wordTable[i][1]));
        }

        System.out.println("\nShortest word: " + wordTable[indexes[0]][0] + " (Length: " + wordTable[indexes[0]][1] + ")");
        System.out.println("Longest word: " + wordTable[indexes[1]][0] + " (Length: " + wordTable[indexes[1]][1] + ")");

        sc.close();
    }
}
