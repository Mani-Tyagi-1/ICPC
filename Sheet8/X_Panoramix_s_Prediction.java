import java.io.*;
import java.util.*;
public class X_Panoramix_s_Prediction
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
    
    public static int checkImPrime(int n1) {
        if (n1 <= 1)
            return 2;

        boolean isFound = false;

        while (isFound != true) {
            n1++;
            for (int i = 2; i < n1; i++) {
                if (n1 % i == 0) {
                    isFound = false;
                    break;
                } else
                    isFound = true;
            }
            if (isFound == true)
                return n1;
        }

        return -1;
    }

    public static void solve()
    {
        Reader R = new Reader();

        int n1 = R.nextInt();
        int n2 = R.nextInt();



        for (int i = 2; i < n2; i++) {
            if (n2 % i == 0) {
                System.out.println("NO");
                return;
            }
        }

        // if immidiarte prime is equal if n2 or not
        int x = checkImPrime(n1);
        if (x == n2)
            System.out.println("YES");
        else
            System.out.println("NO");
        
        
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