import java.io.*;
import java.util.*;

public class F_Front_End {
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

        long len = R.nextLong();

        long arr[] = new long[(int) len];

        for (int i = 0; i < len; i++) {
            arr[i] = R.nextLong();
        }

        int left = 0;
        int right = (int) len - 1;

        while (left <= right) {
            if (left == right) {
                System.out.print(arr[left] + " ");
                break;
            } else {

                System.out.print(arr[left] + " ");
                left++;
                System.out.print(arr[right] + " ");
                right--;
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
}}