import java.util.Scanner;

public class MatrixOperations {

    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // random 0–9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows for matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns for matrices: ");
        int cols = sc.nextInt();

        int[][] A = createMatrix(rows, cols);
        int[][] B = createMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);

        int[][] sum = addMatrices(A, B);
        int[][] diff = subtractMatrices(A, B);
        System.out.println("\nMatrix Addition:");
        displayMatrix(sum);
        System.out.println("\nMatrix Subtraction:");
        displayMatrix(diff);

        System.out.print("\nEnter columns for Matrix B (for multiplication): ");
        int mulCols = sc.nextInt();
        int[][] Bmul = createMatrix(cols, mulCols);

        System.out.println("\nMatrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B (for multiplication):");
        displayMatrix(Bmul);

        int[][] product = multiplyMatrices(A, Bmul);
        System.out.println("\nMatrix Multiplication:");
        displayMatrix(product);
    }
}
