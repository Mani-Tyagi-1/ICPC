import java.io.*;
import java.util.*;
public class I_Count_Vowels
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
    
    private static int countVowel(String str, int count, int n) {

        if (n == -1) {
            return count;
        }
        else if(str.charAt(n) == 'a' || str.charAt(n) == 'e' || str.charAt(n) == 'i' || str.charAt(n) == 'o' || str.charAt(n) == 'u') {
            count++;
        }

        return countVowel(str, count, n - 1);
        
        
    }

    public static void solve()
    {
        Reader R=new Reader();

        String s = R.nextLine();
        s = s.toLowerCase();

        int count = countVowel(s, 0, s.length() - 1);

        System.out.println(count);

        
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