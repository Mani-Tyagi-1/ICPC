import java.io.*;
import java.util.*;

public class E_Construct_The_Sum {
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

        int t = R.nextInt();
        for (int i = 0; i < t; i++) {
            long n = R.nextLong();
            long s = R.nextLong();

            if (n >= s) {
                System.out.println(1 + " " + s);
            }
            else {
                long arr[] = new long[100000];
                int counter = 0;
                int nums = 0;
                while (s > 0) {
                    if (s >= n) {
                        arr[counter] = n;
                        n--;
                        s -= arr[counter];
                        counter++;
                    } else {
                        arr[counter] = s;
                        s = 0;
                    }
                    nums++;
                }
                System.out.print(nums+" ");
                for (int z = 0; z < nums; z++) {
                    if (z == nums - 1) {
                        System.out.print(arr[z]);

                    } else {
                        System.out.print(arr[z] + " ");
                    }
                }
                if(i != t-1)
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