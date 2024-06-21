import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class J_Prime_Factors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        Map<Long, Integer> primeFactors = getPrimeFactors(N);
        printPrimeFactors(primeFactors);
    }

    public static Map<Long, Integer> getPrimeFactors(long N) {
        Map<Long, Integer> primeFactors = new TreeMap<>();

        // Check for the number of 2s that divide N
        while (N % 2 == 0) {
            primeFactors.put(2L, primeFactors.getOrDefault(2L, 0) + 1);
            N /= 2;
        }

        // N must be odd at this point, thus a skip of 2 (i.e., we check 3, 5, 7, ...)
        for (long i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
                N /= i;
            }
        }

        // This condition is to check if N is a prime number greater than 2
        if (N > 2) {
            primeFactors.put(N, primeFactors.getOrDefault(N, 0) + 1);
        }

        return primeFactors;
    }

    public static void printPrimeFactors(Map<Long, Integer> primeFactors) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Long, Integer> entry : primeFactors.entrySet()) {
            if (result.length() > 0) {
                result.append("*");
            }
            result.append("(").append(entry.getKey()).append("^").append(entry.getValue()).append(")");
        }
        System.out.println(result.toString());
    }
}
