import java.util.Scanner;

public class MatrixAdvanced {

    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // random 0–9
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = A[i][j];
            }
        }
        return trans;
    }

    public static double determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    public static double determinant3x3(int[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
             - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
             + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    public static double[][] inverse2x2(int[][] A) {
        double det = determinant2x2(A);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / det;
        inv[0][1] = -A[0][1] / det;
        inv[1][0] = -A[1][0] / det;
        inv[1][1] = A[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] A) {
        double det = determinant3x3(A);
        if (det == 0) return null;

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int r = 0, c = 0;
                for (int m = 0; m < 3; m++) {
                    if (m == i) continue;
                    c = 0;
                    for (int n = 0; n < 3; n++) {
                        if (n == j) continue;
                        minor[r][c] = A[m][n];
                        c++;
                    }
                    r++;
                }
                double minorDet = determinant2x2(minor);
                inv[j][i] = Math.pow(-1, i + j) * minorDet / det;
            }
        }
        return inv;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        int[][] matrix = createMatrix(n, n);
        System.out.println("\nMatrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (n == 2) {
            double det = determinant2x2(matrix);
            System.out.println("\nDeterminant (2x2): " + det);
            double[][] inv = inverse2x2(matrix);
            if (inv == null) {
                System.out.println("Inverse does not exist (det=0).");
            } else {
                System.out.println("\nInverse (2x2):");
                displayMatrix(inv);
            }
        } else if (n == 3) {
            double det = determinant3x3(matrix);
            System.out.println("\nDeterminant (3x3): " + det);
            double[][] inv = inverse3x3(matrix);
            if (inv == null) {
                System.out.println("Inverse does not exist (det=0).");
            } else {
                System.out.println("\nInverse (3x3):");
                displayMatrix(inv);
            }
        }
    }
}
