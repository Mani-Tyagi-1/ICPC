import java.util.Scanner;

public class V_Creating_Expression_1 {
    public static boolean canFormExpression(int[] A, int N, int X, int currentIndex, long currentSum) {
        if (currentIndex == N) {
            return currentSum == X;
        }
        // Recurse by adding the current element
        boolean add = canFormExpression(A, N, X, currentIndex + 1, currentSum + A[currentIndex]);
        // Recurse by subtracting the current element
        boolean subtract = canFormExpression(A, N, X, currentIndex + 1, currentSum - A[currentIndex]);
        return add || subtract;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        if (canFormExpression(A, N, X, 1, A[0])) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
