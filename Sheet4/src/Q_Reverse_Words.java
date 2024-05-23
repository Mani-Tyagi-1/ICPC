import java.io.*;
import java.util.*;
public class Q_Reverse_Words
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
    
    public static String reverse(String str) {

        String temp = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            temp=temp+str.charAt(i);
        }
        return temp;
    }

    public static void solve()
    {
        Reader R=new Reader();

        String str = R.nextLine();
        
        StringBuilder sb = new StringBuilder();
        int x = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                String wrd = str.substring(x, i);
                x = i + 1;
                sb.append(reverse(wrd));
                sb.append(" ");
            }
        }

        sb.append(reverse(str.substring(x)));

        System.out.println(sb.toString());
        
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