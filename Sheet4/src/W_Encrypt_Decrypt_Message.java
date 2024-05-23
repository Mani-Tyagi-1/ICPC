import java.io.*;
import java.util.*;
public class W_Encrypt_Decrypt_Message
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

        int ch=R.nextInt();

        String str = R.nextLine();
        StringBuilder ans = new StringBuilder();

        String Key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";

        String Original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        if (ch == 1) {
            for (char c : str.toCharArray()) {
                int index = Original.indexOf(c);
                if (index != -1) {
                    ans.append(Key.charAt(index));
                } else {
                    ans.append(c); // Handle characters not in the mapping
                }
            }
        }

        else {
            for (char c : str.toCharArray()) {
                int index = Key.indexOf(c);
                if (index != -1) {
                    ans.append(Original.charAt(index));
                } else {
                    ans.append(c); // Handle characters not in the mapping
                }
            }
        }

        System.out.println(ans.toString());

        

        
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