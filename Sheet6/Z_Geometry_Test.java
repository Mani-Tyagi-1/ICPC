import java.util.Scanner;

public class Z_Geometry_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values for radius of the circle and side length of the square
        double R = scanner.nextDouble();
        double S = scanner.nextDouble();

        // Calculate the diagonal of the square
        double squareDiagonal = S * Math.sqrt(2);

        // Determine and print the result
        if (S <= R * Math.sqrt(2)) {
            System.out.println("Circle");
        } else if (2 * R <= S) {
            System.out.println("Square");
        } else {
            System.out.println("Complex");
        }

        scanner.close();
    }
}
