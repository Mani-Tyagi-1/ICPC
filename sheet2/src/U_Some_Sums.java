import java.io.*;
import java.util.*;
public class U_Some_Sums
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
    
    public static int calSum(int n) {
        
        int sum=0, d;
        while (n != 0) {
            d = n % 10;
            n = n / 10;
            sum += d;
        }

        return sum;
    }

    public static void solve()
    {
        Reader R = new Reader();

        int n = R.nextInt();
        int a = R.nextInt();
        int b = R.nextInt();
        int tsum = 0;
        int sum;

        for (int i = 1; i <= n; i++) {

            sum = calSum(i);
            if (sum >= a && sum <= b) {
                tsum += i;
            }
        }
        
        System.out.println(tsum);

        
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