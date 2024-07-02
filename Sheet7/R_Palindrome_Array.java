import java.util.Scanner;

public class R_Palindrome_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        scanner.close();

        if (isPalindrome(A, 0, N - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(int[] A, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (A[left] != A[right]) {
            return false;
        }
        return isPalindrome(A, left + 1, right - 1);
    }
}
