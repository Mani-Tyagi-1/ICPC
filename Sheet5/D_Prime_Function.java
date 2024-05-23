import java.io.*;
import java.util.*;
public class D_Prime_Function
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
    

    public static boolean checkPrime(long n) {

        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (long i = 5; i*i < n; i+=6) {
            if (n % i == 0 && n%(i+2)==0)
                return false;
        }
        return true;
    }

    public static void solve()
    {
        Reader R = new Reader();

        int t = R.nextInt();

        while ((t--)>0) {
            long n = R.nextInt();

            if (checkPrime(n))
                System.out.println("YES");
            else
                System.out.println("NO");
            
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