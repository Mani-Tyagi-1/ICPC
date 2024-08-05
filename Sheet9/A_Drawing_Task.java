import java.util.Scanner;

public class A_Drawing_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int cases = scanner.nextInt();

        char[][] arr = new char[rows][cols];

        // Initialize the array with '.'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = '.';
            }
        }

        while (cases-- > 0) {
            int r1 = scanner.nextInt();
            int c1 = scanner.nextInt();
            int r2 = scanner.nextInt();
            int c2 = scanner.nextInt();
            char chr = scanner.next().charAt(0);

            r1--;
            r2--;
            c1--;
            c2--;

            for (int i = Math.min(r1, r2); i <= Math.max(r1, r2); i++) {
                for (int x = Math.min(c1, c2); x <= Math.max(c1, c2); x++) {
                    arr[i][x] = chr;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
