import java.io.*;
import java.util.*;
public class V_Comparison
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
        Reader S = new Reader();

        String str = S.nextLine();
        String s1 = "";
        String s2 = "";
        char ch=' ';

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
             
            if (ch == '<' || ch == '>' || ch == '=') {
                s1 = str.substring(0, i-1);
                s2 = str.substring(i + 2);
                break;
            }
        }

        
        
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        if((ch=='<' && a<b) || (ch=='>' && a>b) ||(ch=='=' && a==b))
            System.out.println("Right");
        else
            System.out.println("Wrong");
        
        
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