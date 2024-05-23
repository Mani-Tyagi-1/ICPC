import java.io.*;
import java.util.*;
public class N_Max_Subsequence
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

        int n = R.nextInt(); // length of string
        String str = R.nextLine(); // string 

        if (n <0) {
            System.out.println(0);
        }
        else {
            int l = 0;
            int r = 1;
            int maxLen = 1;

            // while (r < n) {
            //     if (str.charAt(r) == str.charAt(r - 1)) {
            //         if (l == 0) {
            //             maxLen = Math.max((r - l), maxLen);
            //         }
            //         else {
            //             maxLen = Math.max((r - l +1), maxLen);

            //         }
            //         l = r;
            //     }
            //     r++;
            // }
            int maxLength = 0;
            char prevChar = '\0';
            for (int i = 0; i < n; i++) {
                char currentChar = str.charAt(i);
                if (currentChar != prevChar) {
                    maxLength++;
                    prevChar = currentChar;
                }
            }
            System.out.println(maxLength);

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