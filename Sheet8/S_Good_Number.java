import java.io.*;
import java.util.*;
public class S_Good_Number
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
        Reader sc = new Reader();

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();

            Set<Long> set = new HashSet<>();

            while (num > 0) {
                long d = num % 10;
                set.add(d);
                num = num / 10;
            }

            boolean flag = true;
            for (long j = 0; j <= k; j++) {
                if (!set.contains(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                count++;

        }
        
        System.out.println(count);
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