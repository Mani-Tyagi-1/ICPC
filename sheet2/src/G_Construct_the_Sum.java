import java.io.*;
import java.util.*;

public class G_Construct_the_Sum {
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
        Reader S = new Reader();

        int t = S.nextInt();

        for (int x = 0; x < t; x++) {
            long n = S.nextLong();
            long s = S.nextLong();

            if (n == 1 && s == 1) {
                System.out.println(1);
            } 
             else {

                ArrayList<Long> arr = new ArrayList<>();

                for (long i = 1; i < n; i++) {
                    if (i < s) {
                        if (s - i >= i + 1) {
                            arr.add(i);
                            s = s - i;

                        } else {
                            arr.add(s);
                            s = 0;
                            break;
                        }
                    }
                }
                if (s != 0 && s < n) {
                    arr.add(s);
                    s = 0;
                }

                if (s != 0)
                    System.out.println(-1);
                else {
                    for (int i = arr.size() - 1; i >= 0; i--) {
                        System.out.print(arr.get(i) + " ");
                    }

                }

                System.out.println();
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