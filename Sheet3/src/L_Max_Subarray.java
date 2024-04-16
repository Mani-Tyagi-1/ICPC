import java.io.*;
import java.util.*;
public class L_Max_Subarray
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
            
            int len = R.nextInt();
    
            long arr[] = new long[len];
    
            for (int i = 0; i < len; i++) {
                arr[i] = R.nextLong();
            }
    
            long max = 0;
            for (int i = 0; i < len; i++) {
                for (int j = i; j < len; j++) {

                    if (i == j) {
                        max = arr[j];
                        System.out.print(max+" ");
                        continue;
                    }
                    
                    max = Math.max(max, arr[j]);
                    System.out.print(max+" ");
                }
            }
            System.out.println();
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