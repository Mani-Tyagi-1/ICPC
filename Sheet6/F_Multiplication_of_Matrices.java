import java.util.Scanner;

public class F_Multiplication_of_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions and elements of Matrix A
        int RA = sc.nextInt();
        int CA = sc.nextInt();
        int[][] A = new int[RA][CA];
        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Read dimensions and elements of Matrix B
        int RB = sc.nextInt();
        int CB = sc.nextInt();
        int[][] B = new int[RB][CB];
        for (int i = 0; i < RB; i++) {
            for (int j = 0; j < CB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Initialize the result matrix C
        int[][] C = new int[RA][CB];
        
        // Perform matrix multiplication
        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CB; j++) {
                for (int k = 0; k < CA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output the result matrix
        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
