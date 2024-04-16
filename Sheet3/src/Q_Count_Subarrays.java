import java.io.*;
import java.util.*;
public class Q_Count_Subarrays
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
            
            int count = 0;
            boolean flag = true;
            for (int i = 0; i < len; i++) {
                flag = true;
                for (int j = i; j < len; j++) {
                    flag = true;
                    for (int k = i; k < j; k++) {

                        if (arr[k] > arr[k + 1]) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        count++;
                }
            }
            System.out.println(count);

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