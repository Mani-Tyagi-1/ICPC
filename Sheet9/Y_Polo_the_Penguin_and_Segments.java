
import java.util.Scanner;

public class Y_Polo_the_Penguin_and_Segments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long size = scanner.nextLong();
        long num = scanner.nextLong();
        long line = 0;

        for (long i = 0; i < size; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            line += (y - x + 1);
        }

        line %= num;
        if (line == 0) {
            System.out.println(line);
        } else {
            System.out.println(num - line);
        }

        scanner.close();
    }
}
