import java.io.*;
import java.util.*;

public class C_Finding_Minimums {
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

    public static void solve()
    {
        Reader R = new Reader();

        long num = R.nextLong();
        long k = R.nextLong();
        long max = Long.MAX_VALUE;

        for (long i = 1; i <= num; i++) {
            long n = R.nextLong();
            max = Math.min(max, n);
            
            if (i % k == 0 ) {
                System.out.print(max + " ");
                max = Long.MAX_VALUE;
            }
            else if (i==num) {
                System.out.print(max + " ");
                break;
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