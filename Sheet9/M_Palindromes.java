import java.io.*;
import java.util.*;
public class M_Palindromes
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

        String str = R.nextLine();

        
        int end=str.length()-1;
        int x = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(end )) {
                x = 1;
            }
            end--;
        }

        if (x == 1) {
            System.out.println(str.length());
        }
        else {
            int arr[] = new int[10000];
            int res = 0;
            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i)]++;
            }

            for (int i = 'a'; i <= 'z'; i++) {
                if (arr[i] > 0)
                    res++;
            }

            if (res == 1) {
                System.out.println(0);
            }
            else {
                System.out.println(str.length()-1);
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