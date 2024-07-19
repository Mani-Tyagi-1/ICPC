import java.io.*;
import java.util.*;
public class C_Koko_And_The_Transformation
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
        
        long n1=sc.nextLong();
        long n2 = sc.nextLong();
        
        int arr1[] = new int[(int) n1];
        int arr2[] = new int[(int) n2];

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
            sum1 += arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];
        }

        if (sum1 == sum2) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
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