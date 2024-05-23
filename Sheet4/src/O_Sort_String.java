import java.io.*;
import java.util.*;
public class O_Sort_String
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
        String str = R.nextLine();

        if (n == 0) {
            System.out.println("");
        }

        else if (n == 1) {
            System.out.println(str);
        }
        else {
            char[] arr = str.toCharArray();
            
            for (int i = 0; i < n - 1; i++) {
                int min = i;
                for (int j = i+1; j < n; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                // swap
                char temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
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