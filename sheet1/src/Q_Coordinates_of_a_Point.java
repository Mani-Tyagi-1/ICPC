import java.io.*;
import java.util.*;

public class Q_Coordinates_of_a_Point {
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
        Reader S = new Reader();

        double x = S.nextDouble();
        double y = S.nextDouble();

        if (x == 0.0 && y == 0.0)
            System.out.println("Origem");
        else if (x == 0.0)
            System.out.println("Eixo Y");
        else if (y == 0.0)
            System.out.println("Eixo X");
        else {
            if (x > 0 && y > 0)
                System.out.println("Q1");
            else if (x < 0 && y > 0)
                System.out.println("Q2");
            else if (x < 0 && y < 0)
                System.out.println("Q3");
            else
                System.out.println("Q4");
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