import java.util.Scanner;

public class P_Log_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();
        System.out.println(log2(N));
    }

    public static int log2(long N) {
        if (N == 1) {
            return 0;
        } else {
            return 1 + log2(N / 2);
        }
    }
}
