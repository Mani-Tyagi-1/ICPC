import java.io.*;
import java.util.*;
public class C_Wonderful_Number
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
    
    public static boolean checkPalindrom(List<Integer> li) {

        List<Integer> rev = new ArrayList<>();
        
        for (int i = li.size() - 1; i >= 0; i--) {
            rev.add(li.get(i));
        }
        
        if (li.equals(rev))
            return true;
        else
            return false;
    }

    public static void solve()
    {
        Reader R = new Reader();
        
        int num = R.nextInt();
        int n = num;

        if (n % 2 == 0) {
            System.out.println("NO");
        } else {
            List<Integer> li = new ArrayList<>();

            while (n != 0) {

                int bit = n & 1;
                n = n >> 1;
                li.add(bit);
            }
            
            if (checkPalindrom(li)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
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