import java.io.*;
import java.util.*;

public class N_Check_Code {
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

        int A = R.nextInt();
        int B = R.nextInt();
        boolean flag = true;

        String str = R.nextLine();

        if (A + B + 1 == str.length()) {
            if (str.charAt(A) == '-') {
                for (int i = A + 1; i < str.length(); i++) {
                    if ((int) (str.charAt(i)) >= 48 && (int) (str.charAt(i)) <= 57)
                        flag = true;
                    else {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            } else
                System.out.println("No");
        } else
            System.out.println("No");
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