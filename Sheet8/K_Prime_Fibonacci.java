import java.util.Scanner;

public class K_Prime_Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] queries = new int[T];
        for (int i = 0; i < T; i++) {
            queries[i] = sc.nextInt();
        }
        sc.close();

        // Calculate the first 50 Fibonacci numbers
        long[] fibonacci = new long[51];
        fibonacci[1] = 0;
        fibonacci[2] = 1;
        for (int i = 3; i <= 50; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Check each queried Fibonacci number for primality
        for (int i = 0; i < T; i++) {
            int N = queries[i];
            if (isPrime(fibonacci[N])) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }

    // Helper function to check if a number is prime
    private static boolean isPrime(long num) {
        if (num < 2)
            return false;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
