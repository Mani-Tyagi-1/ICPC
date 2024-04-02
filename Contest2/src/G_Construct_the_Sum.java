import java.io.*;
import java.util.*;
public class G_Construct_the_Sum
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

        int t = R.nextInt();

        
        while ((t--) > 0) {
            long n = R.nextLong();
            long s = R.nextLong();
            long oriSum=s;

            long sum = 0;

            if ((n * (n + 1) / 2) > s) {

                for (long i = n; i >= 1; i--) {
                    if (i <= s && sum < oriSum) {
                        System.out.print(i + " ");
                        s = s - i;
                        sum += i;
                    }
                    else if(s==0)
                        break;
                }
                System.out.println();
            }
            else {
                System.out.println(-1);
            }
           

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