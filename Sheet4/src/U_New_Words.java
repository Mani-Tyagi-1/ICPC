import java.io.*;
import java.util.*;
public class U_New_Words
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
        str = str.toLowerCase();
        int min = Integer.MAX_VALUE;

        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'e' || str.charAt(i) == 'g' || str.charAt(i) == 'y' || str.charAt(i) == 'p'
                    || str.charAt(i) == 't') {
                mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i), 0) + 1);

            }
        }

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            
            min = Math.min(min, entry.getValue());
        }
        
        System.out.println(min);
        
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