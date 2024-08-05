import java.util.Scanner;

public class X_Mountain_Scenery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int mountains = scanner.nextInt();

        size = size * 2 + 1;

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i += 2) {
            if (arr[i] > arr[i - 1] + 1 && arr[i] > arr[i + 1] + 1) {
                arr[i]--;
                mountains--;
            }

            if (mountains == 0) {
                break;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
