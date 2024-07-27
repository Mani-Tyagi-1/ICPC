import java.io.*;
import java.util.*;

public class V_Is_it_rated {
    static PrintWriter out = new PrintWriter((System.out));

    public static void main(String args[]) throws IOException {
        // Reader sc = new Reader();
        // int t = sc.nextInt();
        // while (t-- > 0) {
            solve();
        // }
        // out.close();
    }

    public static void solve() {
        Reader R = new Reader();
        
        int n = R.nextInt();

        int prev[] = new int[n];
        int curr[] = new int[n];

        
        boolean isRated = false;
        boolean isunRated = false;

        for (int i = 0; i < n; i++) {
            prev[i] = R.nextInt();
            curr[i] = R.nextInt();

            if (prev[i] != curr[i]) {
                isRated = true;
            }
        }

        if (isRated) {
            System.out.println("rated");
        }
        else {
            for (int i = 1; i < n; i++) {
                if (prev[i] > prev[i - 1]) {
                    isunRated = true;
                    break;
                }
            }
            
            if (isunRated)
                System.out.println("unrated");
            else 
                System.out.println("maybe");
        }

        
        
    }

    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = br.readLine();
            } catch (Exception e) {
            }
            if (next == null) {
                return false;
            }
            st = new StringTokenizer(next);
            return true;
        }
    }
}