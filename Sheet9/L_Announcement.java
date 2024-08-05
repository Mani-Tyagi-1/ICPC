import java.util.HashMap;
import java.util.Scanner;

public class L_Announcement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] levels = new int[N];

        // Read difficulty levels
        for (int i = 0; i < N; i++) {
            levels[i] = sc.nextInt();
        }

        // HashMap to count frequency of each difficulty level
        HashMap<Integer, Integer> difficultyCount = new HashMap<>();

        // Count the frequency of each difficulty level
        for (int level : levels) {
            difficultyCount.put(level, difficultyCount.getOrDefault(level, 0) + 1);
        }

        int replaceCount = 0;
        for (int count : difficultyCount.values()) {
            if (count > 1) {
                replaceCount += (count - 1);
            }
        }

        // Output the result
        if (replaceCount == 0) {
            System.out.println(-1);
        } else {
            System.out.println(replaceCount);
        }

        sc.close();
    }
}
