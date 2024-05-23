import java.io.*;
import java.util.*;

public class G_Even_Hate_Odd {
    static PrintWriter out = new PrintWriter((System.out));

    public static void main(String args[]) throws IOException {
        // Reader sc=new Reader();
        // int t=sc.nextInt();
        // while((t--)>0)
        // {
        solve();
        // }
        // out.close();
    }

    public static void solve() {
        Reader R = new Reader();

        int t = R.nextInt();

        while ((t--) > 0) {

            long len = R.nextLong();
            int count = 0;

            long arr[] = new long[(int) len];
            if (len % 2 == 0) {
                for (int i = 0; i < len; i++) {
                    arr[i] = R.nextLong();

                    if (arr[i] % 2 == 0) {
                        count++;
                    } else {
                        count--;
                    }
                }
                count = Math.abs(count);
                System.out.println(count/2);

            } else {
                for (int i = 0; i < len; i++) {
                    arr[i] = R.nextLong();
                }

                System.out.println(-1);
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