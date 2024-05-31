import java.io.*;
import java.util.*;
public class K_Shift_Right
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
        int len = R.nextInt();
        int k = R.nextInt();

        long nums[] = new long[len];
        for (int i = 0; i < len; i++) {
            nums[i] = R.nextLong();
        }

        if (k > len)
            k = k % len;
        
        long temp[] = new long[len];
        int ind = 0;
        for (int i = len - k ; i < len; i++) {
            temp[ind++] = nums[i];
        }
        
        for (int i = 0; i <= len - k - 1; i++) {
            temp[ind++] = nums[i];
        }

        for (int i = 0; i < len; i++) {
            System.out.print(temp[i]+" ");
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