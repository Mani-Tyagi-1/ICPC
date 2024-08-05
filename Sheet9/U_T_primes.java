import java.util.*;
import java.io.*;

public class U_T_primes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] numbers = new long[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextLong();
        }

        
        long max = 0;
        for (long number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        int limit = (int) Math.sqrt(max) + 1;

        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        Set<Long> primes = new HashSet<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add((long) i);
            }
        }

        for (long number : numbers) {
            if (isTPrime(number, primes)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    private static boolean isTPrime(long number, Set<Long> primes) {
        if (number < 4)
            return false; 
        long sqrt = (long) Math.sqrt(number);
        return sqrt * sqrt == number && primes.contains(sqrt);
    }
}
