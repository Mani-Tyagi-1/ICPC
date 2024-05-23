import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class G_Conversion {
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

        String str = R.nextLine();
        
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (c == ',') {
                sb.append(' ');
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        
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