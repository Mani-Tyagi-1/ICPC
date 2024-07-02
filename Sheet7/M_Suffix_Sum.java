import java.io.*;
import java.util.*;
public class M_Suffix_Sum
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        //     Reader sc=new Reader();
        //     int t=sc.nextInt();
        //     while(t-->0)
        //     {
        solve();
        //     }
        // out.close();
    }
    
    static long calSum(long arr[], long sum, int n,int m) {
        if (m==1) {
            return sum + arr[n];
        }
        sum+=arr[n];
        return calSum(arr, sum, n - 1,m-1);
    }

    public static void solve()
    {
        Reader sc = new Reader();
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextLong();
        }
        
        long sum = calSum(arr, 0, n - 1, m);
        System.out.println(sum);
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