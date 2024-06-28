import java.io.*;
import java.util.*;

public class T_Circle_Task {
    static PrintWriter out = new PrintWriter((System.out));

    public static void main(String args[]) throws IOException {
        // Reader sc=new Reader();
        // int t=sc.nextInt();
        // while(t-->0)
        // {
        solve();
        // }
        // out.close();
    }

    public static void solve() {
        Reader sc = new Reader();

        long x = sc.nextLong();
        long y = sc.nextLong();
        long r = sc.nextLong();

        

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long x1 = sc.nextLong();
            long y1 = sc.nextLong();

            long dx = x1 - x;
            long dy = y1 - y;

            long dist = dx * dx + dy * dy;
            long radius = r * r;

            if (dist <= radius) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

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