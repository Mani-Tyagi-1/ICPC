import java.io.*;
import java.util.*;
public class I_Divisability
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

    public static void solve()
    {
        Reader R = new Reader();

        long a=R.nextLong();
        long b=R.nextLong();
        long n = R.nextLong();

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        long start = (a % n == 0) ? a : (a + (n - a % n));
        long end = (b % n == 0) ? b : (b - (b % n));

        if (start > end) {
            System.out.println(0);
        }
        else {
            long x = ((end - start) / n) + 1;
            long sum = (start+end) * x / 2;
            System.out.println(sum);
        }
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