import java.io.*;
import java.util.*;

public class R_Distance_points {
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

        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();

        double ans =  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        System.out.printf("%.9f",ans);
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