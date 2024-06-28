import java.util.Scanner;

public class X_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the coordinates of the rectangle
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        // Calculate the boundaries of the rectangle
        int minX = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int maxX = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int minY = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int maxY = Math.max(Math.max(y1, y2), Math.max(y3, y4));

        // Read the number of points
        int N = scanner.nextInt();

        // Check each point
        for (int i = 0; i < N; i++) {
            int xi = scanner.nextInt();
            int yi = scanner.nextInt();

            if (xi >= minX && xi <= maxX && yi >= minY && yi <= maxY) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
