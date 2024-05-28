import java.io.*;
import java.util.*;
public class F_Equation
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        // Reader sc=new Reader();
        // int t=sc.nextInt();
        // while(t-->0)
        // {
        solve();
        // }
        // out.close();
    }
    
    public static int func(int num, int n) {

        int sum=0;
        for (int i = 0; i <= n; i += 2) {

            int term = (int)Math.pow(num, i);

            if (i == 0) {
                sum += term - 1;
            }
            else {
                
                sum += term;
            }


        }
        return sum;
        

            
        
    }

    public static void solve()
    {
        Reader R = new Reader();
        int num = R.nextInt();
        int n = R.nextInt();
        int ans = 0;

        if (n % 2 == 0) {
            ans = func(num, n);
        }
        else {
            ans = func(num, n - 1);
        }
        
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