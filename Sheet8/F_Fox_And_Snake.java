import java.util.Scanner;

public class F_Fox_And_Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input values
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Create the grid
        char[][] grid = new char[n][m];

        // Fill the grid with dots ('.')
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = '.';
            }
        }

        // Fill the snake pattern with number signs ('#')
        boolean right = true;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Fill the entire row with '#'
                for (int j = 0; j < m; j++) {
                    grid[i][j] = '#';
                }
            } else {
                if (right) {
                    // Fill the last cell of the row with '#'
                    grid[i][m - 1] = '#';
                } else {
                    // Fill the first cell of the row with '#'
                    grid[i][0] = '#';
                }
                right = !right;
            }
        }

        // Print the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
