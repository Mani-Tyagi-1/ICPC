import java.io.*;
import java.util.*;
public class H_Launch_of_Collider
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
        String str = R.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = R.nextInt();
        }


        int  minTime = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == 'R' && str.charAt(i + 1) == 'L') {
                int time = (arr[i + 1] - arr[i]) / 2;
                minTime = Math.min(minTime, time);
            }
        }
        
        if (minTime == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            System.out.println(minTime);
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