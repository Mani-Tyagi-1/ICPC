import java.util.Scanner;

public class X_The_maximum_path_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Read matrix elements
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Call the recursive function to find the maximum path sum
        int maxSum = findMaxPathSum(matrix, 0, 0);
        System.out.println( maxSum);
    }

    // Recursive function to find the maximum path sum
    public static int findMaxPathSum(int[][] matrix, int i, int j) {
        int N = matrix.length;
        int M = matrix[0].length;

        // Base case: if the current cell is the bottom-right cell, return its value
        if (i == N - 1 && j == M - 1) {
            return matrix[i][j];
        }

        // Move down
        int downSum = Integer.MIN_VALUE;
        if (i + 1 < N) {
            downSum = findMaxPathSum(matrix, i + 1, j);
        }

        // Move right
        int rightSum = Integer.MIN_VALUE;
        if (j + 1 < M) {
            rightSum = findMaxPathSum(matrix, i, j + 1);
        }

        // Return the maximum sum path including the current cell
        return matrix[i][j] + Math.max(downSum, rightSum);
    }
}
