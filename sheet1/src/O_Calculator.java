import java.io.*;
import java.util.*;
public class O_Calculator
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
        String a="", b="";
        char ch=' ';

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                a = str.substring(0, i);
                b = str.substring(i + 1);
                break;
            }
        }

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);


        if(ch=='+')
            System.out.println(num1+num2);
        else if (ch=='-')
            System.out.println(num1 - num2);
        else if (ch=='*')
            System.out.println(num1 * num2);
        else if(ch=='/')
            System.out.println((int)(num1 / num2));
        

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