import java.util.Scanner;

public class N_Cakeminator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine(); // Consume the newline

        char[][] cake = new char[r][c];
        boolean[] rowContainsStrawberry = new boolean[r];
        boolean[] colContainsStrawberry = new boolean[c];

        for (int i = 0; i < r; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < c; j++) {
                cake[i][j] = line.charAt(j);
                if (cake[i][j] == 'S') {
                    rowContainsStrawberry[i] = true;
                    colContainsStrawberry[j] = true;
                }
            }
        }

        int maxCellsEaten = 0;

        // Count the rows without strawberries
        for (int i = 0; i < r; i++) {
            if (!rowContainsStrawberry[i]) {
                maxCellsEaten += c;
            }
        }

        // Count the columns without strawberries, avoiding double counting
        for (int j = 0; j < c; j++) {
            if (!colContainsStrawberry[j]) {
                for (int i = 0; i < r; i++) {
                    if (!rowContainsStrawberry[i])
                        continue; // Already counted in a safe row
                    if (cake[i][j] == '.') {
                        maxCellsEaten++;
                    }
                }
            }
        }

        System.out.println(maxCellsEaten);
    }
}
