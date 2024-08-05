import java.util.Scanner;

public class N_Pumbaa_And_Apples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long rows = scanner.nextLong();
        long cols = scanner.nextLong();
        long cases = scanner.nextLong();

        long[][] arr = new long[(int) rows][(int) cols];

        // Input the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextLong();
            }
        }

        long[] arrR = new long[(int) rows];
        long[] arrC = new long[(int) cols];

        for (int i = 0; i < rows; i++) {
            arrR[i] = i;
        }
        for (int i = 0; i < cols; i++) {
            arrC[i] = i;
        }

        char chr;
        long n1, n2, r, c;

        while (cases-- > 0) {
            chr = scanner.next().charAt(0);

            n1 = scanner.nextLong();
            n2 = scanner.nextLong();
            n1--;
            n2--;

            if (chr == 'g') {
                r = arrR[(int) n1];
                c = arrC[(int) n2];
                System.out.println(arr[(int) r][(int) c]);
            } else if (chr == 'r') {
                long temp = arrR[(int) n1];
                arrR[(int) n1] = arrR[(int) n2];
                arrR[(int) n2] = temp;
            } else if (chr == 'c') {
                long temp = arrC[(int) n1];
                arrC[(int) n1] = arrC[(int) n2];
                arrC[(int) n2] = temp;
            }
        }

        scanner.close();
    }
}
