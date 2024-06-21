

import java.util.Scanner;

public class L_Pascal_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        int[][] triangle = generatePascalsTriangle(N);
        printPascalsTriangle(triangle, N);
    }

    public static int[][] generatePascalsTriangle(int N) {
        int[][] triangle = new int[N][N];
        
        for (int row = 0; row < N; row++) {
            triangle[row][0] = 1;
            triangle[row][row] = 1;
            for (int col = 1; col < row; col++) {
                triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
            }
        }
        
        return triangle;
    }

    public static void printPascalsTriangle(int[][] triangle, int N) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(triangle[row][col] + " ");
            }
            System.out.println();
        }
    }
}
