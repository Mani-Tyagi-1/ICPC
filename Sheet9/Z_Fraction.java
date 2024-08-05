import java.util.Scanner;

public class Z_Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = scanner.nextLong();
        char fract = scanner.next().charAt(0);
        long den1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        fract = scanner.next().charAt(0);
        long den2 = scanner.nextLong();

        long den3 = findBiggestDivDen(den1, den2);
        long num3 = findBiggestDivNum(num1, num2);

        System.out.println(num3 + "/" + den3);

        scanner.close();
    }

    private static long findBiggestDivDen(long den1, long den2) {
        if (den2 != 0) {
            return findBiggestDivDen(den2, den1 % den2);
        }
        return den1;
    }

    private static long findBiggestDivNum(long num1, long num2) {
        return ((num1 / findBiggestDivDen(num1, num2)) * num2);
    }
}
