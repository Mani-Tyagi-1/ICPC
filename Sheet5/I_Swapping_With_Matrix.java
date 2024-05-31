import java.io.*;
import java.util.*;

public class I_Swapping_With_Matrix {
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

    public static int[][] swapRow(int mat[][],int n, int x, int y) {
        for (int i = 0; i < n; i++) {
            int temp = mat[x][i];
            mat[x][i] = mat[y][i];
            mat[y][i] = temp;
        }
        return mat;
    }
    public static int[][] swapCol(int mat[][],int n, int x, int y) {
        for (int i = 0; i < n; i++) {
            int temp = mat[i][x];
            mat[i][x] = mat[i][y];
            mat[i][y] = temp;
        }
        return mat;
    }

    public static void solve() {
        Reader R = new Reader();

        int n = R.nextInt();
        int x = R.nextInt();
        int y = R.nextInt();

        int mat[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = R.nextInt();
            }
        }

        mat = swapRow(mat,n, x-1, y-1);
        mat = swapCol(mat, n, x-1, y-1);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
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