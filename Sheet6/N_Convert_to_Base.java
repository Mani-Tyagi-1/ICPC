import java.math.BigInteger;
import java.util.Scanner;

public class N_Convert_to_Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the type of conversion
        int T = scanner.nextInt();
        
        // Read the number and the base
        String N = scanner.next();
        int X = scanner.nextInt();
        
        if (T == 1) {
            // Convert N from base X to decimal
            BigInteger number = new BigInteger(N, X);
            System.out.println(number.toString());
        } else {
            // Convert N from decimal to base X
            BigInteger number = new BigInteger(N);
            System.out.println(number.toString(X).toUpperCase());
        }

        scanner.close();
    }

    // Convert N from base X to decimal
    public static long convertToDecimal(long N, int X) {
        long decimalValue = 0;
        long multiplier = 1;

        while (N > 0) {
            long digit = N % 10;
            decimalValue += digit * multiplier;
            multiplier *= X;
            N /= 10;
        }

        return decimalValue;
    }

    // Convert N from decimal to base X
    public static String convertToBaseX(long N, int X) {
        StringBuilder baseXValue = new StringBuilder();

        while (N > 0) {
            long digit = N % X;
            char charDigit = (digit < 10) ? (char) ('0' + digit) : (char) ('A' + digit - 10);
            baseXValue.insert(0, charDigit);
            N /= X;
        }

        return baseXValue.toString();
    }
}
