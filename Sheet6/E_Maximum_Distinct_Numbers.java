

import java.util.Scanner;

public class E_Maximum_Distinct_Numbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();
        
        System.out.println(maximumDistinctNumbers(N));
    }
    
    public static long maximumDistinctNumbers(long N) {
        long left = 1;
        long right = (long) Math.sqrt(2 * N);
        long answer = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (sumOfFirstK(mid) <= N) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return answer;
    }
    
    private static long sumOfFirstK(long k) {
        return k * (k + 1) / 2;
    }
}
