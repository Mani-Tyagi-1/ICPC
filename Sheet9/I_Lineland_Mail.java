import java.io.*;
import java.util.*;
public class I_Lineland_Mail
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
        int n = R.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = R.nextInt();
        }

        int maxx = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                minn = Math.abs(arr[i] - arr[i + 1]);
                maxx = Math.abs(arr[i] - arr[n - 1]);
            }
            else if (i == n - 1) {
                minn = Math.abs(arr[i] - arr[i - 1]);
                maxx = Math.abs(arr[i] - arr[0]);
            }
            else {
                minn = Math.min(Math.abs(arr[i] - arr[i + 1]), Math.abs(arr[i] - arr[i - 1]));
                maxx = Math.max(Math.abs(arr[i] - arr[0]), Math.abs(arr[i] - arr[n - 1]));
            }

            System.out.println(minn + " " + maxx);
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