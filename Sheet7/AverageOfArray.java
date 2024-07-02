import java.util.Scanner;

public class S_Arra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int N = scanner.nextInt();
        int[] A = new int[N];

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        scanner.close();

        // Calculate the sum of the array using recursion
        long sum = calculateSum(A, N - 1);

        // Calculate the average
        double average = (double) sum / N;

        // Print the average with 6 digits after the decimal point
        System.out.printf("%.6f\n", average);
    }

    // Recursive function to calculate the sum of the array
    public static long calculateSum(int[] A, int index) {
        // Base case: when index is -1, return 0
        if (index < 0) {
            return 0;
        }
        // Recursive case: add the current element to the sum of the rest of the array
        return A[index] + calculateSum(A, index - 1);
    }
}
