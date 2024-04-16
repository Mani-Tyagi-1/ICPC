import java.io.*;
import java.util.*;
public class R_Permutation_with_arrays
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

        long arr1[] = new long[len];
        long arr2[] = new long[len];

        for (int i = 0; i < len; i++) {
            arr1[i] = R.nextLong();
        }
        for (int i = 0; i < len; i++) {
            arr2[i] = R.nextLong();
        }


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if (arr1[i] != arr2[i]) {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("yes");
        else
        System.out.println("no");

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