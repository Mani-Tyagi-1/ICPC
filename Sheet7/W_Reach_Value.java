import java.util.Scanner;

public class W_Reach_Value {

    // Recursive function to check if we can reach N
    public static boolean canReachN(long current, long target) {
        // If current value exceeds target, return false
        if (current > target) {
            return false;
        }
        // If current value is exactly target, return true
        if (current == target) {
            return true;
        }
        // Try multiplying by 10 and by 20
        return canReachN(current * 10, target) || canReachN(current * 20, target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            long N = scanner.nextLong();
            
            // Check if we can reach N starting from 1
            if (canReachN(1, N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
