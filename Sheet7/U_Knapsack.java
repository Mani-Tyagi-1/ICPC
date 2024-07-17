import java.io.*;
import java.util.*;
public class U_Knapsack
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        // Reader sc=new Reader();
        //     int t=sc.nextInt();
        //     while(t-->0)
        //     {
        solve();
        //     }
        // out.close();
    }

    public static int knapsack(int n, int w, int item[], int val[]) {
        if (n == 0 || w == 0)
            return 0;

        if (item[n - 1] > w) {
            return knapsack(n - 1, w, item, val);
        }
        else {
            int include = val[n - 1] + knapsack(n - 1, w-item[n-1], item, val);
            int exclude = knapsack(n - 1, w, item, val);

            return Math.max(include, exclude);
        }
    }

    public static void solve()
    {
        Reader R = new Reader();

        int n = R.nextInt();
        int w = R.nextInt();

        int item[] = new int[n];
        int val[] = new int[n];

        for (int i = 0; i < n; i++) {
            item[i] = R.nextInt();
            val[i] = R.nextInt();
        }

        int ans = knapsack(n, w, item, val);
        System.out.println(ans);
    }
    
    static class Reader 
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        public String next()
        {
            while(!st.hasMoreTokens())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        public int nextInt()
        {
            return Integer.parseInt(next());
        }
        public long nextLong()
        {
            return Long.parseLong(next());
        }
        public double nextDouble()
        {
            return Double.parseDouble(next());
        }
        public String nextLine()
        {
            try
            {
                return br.readLine();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }
        public boolean hasNext()
        {
            String next=null;
            try
            {
                next=br.readLine();
            }
            catch(Exception e)
            {
            }
            if(next==null)
            {
                return false;
            }
            st=new StringTokenizer(next);
            return true;
        }
    } 
}