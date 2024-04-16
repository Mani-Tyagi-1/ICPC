import java.io.*;
import java.util.*;
public class U_Is_B_a_subsequence_of_A
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
        Reader  R = new Reader();

        int n = R.nextInt();
        int m = R.nextInt();

        long a[] = new long[n];
        long b[] = new long[m];

        for (int i = 0; i < n; i++) {
            a[i] = R.nextLong();
        }

        for (int i = 0; i < m; i++) {
            b[i] = R.nextLong();
        }

        int index = 0;
        long check = b[0];

        for (int i = 0; i < n; i++) {
            if (check == a[i]) {
                
                index += 1;

                if(index<m)
                check = b[index];
                
            }
        }
        
        if (index >= m) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
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