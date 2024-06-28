import java.util.Scanner;

public class W_Circles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first circle's diameter endpoints
        int X1 = scanner.nextInt();
        int Y1 = scanner.nextInt();
        int X2 = scanner.nextInt();
        int Y2 = scanner.nextInt();

        // Read the second circle's diameter endpoints
        int X3 = scanner.nextInt();
        int Y3 = scanner.nextInt();
        int X4 = scanner.nextInt();
        int Y4 = scanner.nextInt();

        scanner.close();

        // Determine if the circles intersect
        String result = circlesIntersect(X1, Y1, X2, Y2, X3, Y3, X4, Y4);
        System.out.println(result);
    }

    private static String circlesIntersect(int X1, int Y1, int X2, int Y2, int X3, int Y3, int X4, int Y4) {
        // Calculate the centers of the circles
        double Cx1 = (X1 + X2) / 2.0;
        double Cy1 = (Y1 + Y2) / 2.0;
        double Cx2 = (X3 + X4) / 2.0;
        double Cy2 = (Y3 + Y4) / 2.0;

        // Calculate the radii of the circles
        double R1 = distance(X1, Y1, X2, Y2) / 2.0;
        double R2 = distance(X3, Y3, X4, Y4) / 2.0;

        // Calculate the distance between the centers of the circles
        double centerDistance = distance(Cx1, Cy1, Cx2, Cy2);

        // Check if circles intersect
        if (centerDistance <= R1 + R2 && centerDistance >= Math.abs(R1 - R2)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
