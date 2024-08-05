import java.util.Scanner;

public class T_Olesya_and_Rodion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digits = scanner.nextInt();
        int divisible = scanner.nextInt();

        if (divisible == 10) {
            if (digits == 1) {
                System.out.println(-1);
            } else {
                System.out.print(1);
                for (int i = 1; i < digits; i++) {
                    System.out.print(0);
                }
            }
        } else {
            for (int i = 1; i <= digits; i++) {
                System.out.print(divisible);
            }
        }

        scanner.close();
    }
}
