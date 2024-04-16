import java.io.*;
import java.util.*;
public class V_Frequency_Array
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

        long n = R.nextLong();
        long m = R.nextLong();

        long arr[] = new long[(int) n];

        for (int i = 0; i < n; i++) {
            arr[i] = R.nextLong();
        }

        // Brute force solution

        // int count = 0;
        // for (int i = 1; i <= m; i++) {
        //     count = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (arr[j] == i) {
        //             count++;
        //         }
        //     }
        //     System.out.println(count);
        // }

        HashMap<Long, Long> map = new HashMap<>();

        for (long i = 1; i <= m; i++) {
            map.put(i, (long) 0);
        }

        for (long num : arr) {

            if (num > 0 && num <= m) {
                map.put(num, map.get(num) + 1);
            }
        }
        
        for (long i = 1; i <= m; i++) {
            System.out.println(map.get(i));
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