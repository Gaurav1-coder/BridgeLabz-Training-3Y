import java.util.Arrays;

public class FootballHeights {

    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150–250
        }
        return heights;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);
        System.out.println("Heights of Players: " + Arrays.toString(heights));

        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}
