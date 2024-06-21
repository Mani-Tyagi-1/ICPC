import java.math.BigInteger;
import java.util.Scanner;

public class M_Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int x = sc.nextInt();

        BigInteger bigS = new BigInteger(s);
        BigInteger bigX = new BigInteger(String.valueOf(x));

        BigInteger rem = bigS.remainder(bigX);
        if (rem.compareTo(BigInteger.ZERO) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();


    }
}
