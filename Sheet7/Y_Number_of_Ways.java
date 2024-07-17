import java.io.*;
import java.util.*;
public class Y_Number_of_Ways
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

    public static int countWays(int current, int end) {
        // Base case: If current position is the end position
        if (current == end) {
            return 1;
        }
        // If current position is greater than end, no way to reach the end
        if (current > end) {
            return 0;
        }

        // Recursive case: Sum the number of ways from the next possible steps
        return countWays(current + 1, end) +
                countWays(current + 2, end) +
                countWays(current + 3, end);
    }
    public static void solve()
    {
        Reader sc = new Reader();
        int current = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(countWays(current, end));

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