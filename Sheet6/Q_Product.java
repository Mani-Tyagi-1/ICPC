import java.io.*;
import java.util.*;
public class Q_Product
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

        long l = R.nextInt();
        long r = R.nextInt();
        long m = R.nextInt();

        long prod = 1;

        for (long i = l; i <= r; i++) {
            prod *= i;
            prod = prod % m;
        }
        
        System.out.println(prod);
        
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