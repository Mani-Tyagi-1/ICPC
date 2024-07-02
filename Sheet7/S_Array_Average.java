import java.util.Scanner;

public class S_Array_Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        scanner.close();

        long sum = calculateSum(A, N - 1);

        double average = (double) sum / N;

        System.out.printf("%.6f\n", average);
    }

    public static long calculateSum(int[] A, int index) {
        if (index < 0) {
            return 0;
        }
        return A[index] + calculateSum(A, index - 1);
    }
}
