import java.io.*;
import java.util.*;

public class X_8_Neighbors {
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
        int m = R.nextInt();

        String ch[][] = new String[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                ch[i][j] = R.nextLine();
            }
        }

        int x = R.nextInt();
        int y = R.nextInt();
        

        if (x == 1) {
            if (y == 1 && (ch[x][y + 1] == "x" && ch[x + 1][y] == "x" && ch[x + 1][y + 1] == "x")) {
                System.out.println("yes");
            } else if (y == m && (ch[x][y - 1] == "x" && ch[x + 1][y - 1] == "x" && ch[x + 1][y] == "x")) {
                System.out.println("yes");
            }
            else if (ch[x][y - 1] == "x" && ch[x + 1][y - 1] == "x" && ch[x + 1][y] == "x" && ch[x + 1][y + 1] == "x"
                    && ch[x][y + 1] == "x") {
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
        }
        else if (x == n) {
            if (y == 1 && (ch[x - 1][y] == "x" && ch[x][y + 1] == "x" && ch[x - 1][y + 1] == "x")) {
                System.out.println("yes");
            } else if (y == m && (ch[x][y - 1] == "x" && ch[x - 1][y - 1] == "x" && ch[x - 1][y] == "x")) {
                System.out.println("yes");
            }
            else if (ch[x][y - 1] == "x" && ch[x - 1][y - 1] == "x" && ch[x - 1][y] == "x" && ch[x][y + 1] == "x"
                    && ch[x - 1][y + 1] == "x") {
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
        }
        else if (y == 1) {
            if (ch[x-1][y] == "x" && ch[x-1][y + 1] == "x" && ch[x][y+1] == "x" && ch[x+1][y] == "x"
                    && ch[x + 1][y + 1] == "x") {
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
        }
        else if (y == m) {
            if (ch[x - 1][y] == "x" && ch[x - 1][y - 1] == "x" && ch[x][y - 1] == "x" && ch[x + 1][y-1] == "x"
                    && ch[x + 1][y] == "x") {
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            if (ch[x - 1][y-1] == "x" && ch[x - 1][y] == "x" && ch[x-1][y + 1] == "x" && ch[x][y - 1] == "x"
                    && ch[x][y+1] == "x" && ch[x + 1][y-1] == "x" && ch[x + 1][y] == "x" && ch[x + 1][y+1] == "x") {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
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