import java.io.*;
import java.util.*;

public class C_Replacement {
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
        Reader R = new Reader();

        int n = R.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = R.nextLong();

        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                arr[i] = 2;
            else if (arr[i] > 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }

            System.out.print(arr[i]+" ");
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