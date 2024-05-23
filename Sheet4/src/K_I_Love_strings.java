import java.io.*;
import java.util.*;
public class K_I_Love_strings
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

        while ((n--) > 0) {
            String str = R.nextLine();
            String s1 = str.substring(0,str.indexOf(' '));
            String s2 = str.substring(str.indexOf(' ')+1);

            int l1 = s1.length();
            int l2 = s2.length();

            String ans = "";
            int i = 0, j = 0;

            while (i < l1 && j < l2) {
                ans += s1.charAt(i);
                i++;

                ans += s2.charAt(j);
                j++;
            }
            
            if (i < l1) {
                ans += s1.substring(i);
            }
            
            if (j < l2) {
                ans += s2.substring(j);
            }

            System.out.println(ans);

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