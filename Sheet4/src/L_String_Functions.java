import java.io.*;
import java.util.*;
public class L_String_Functions
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
        
        int len = R.nextInt();
        int n = R.nextInt();
        String str = R.nextLine();
        
        while((n--) != 0){
            String q = R.next();
            
            if (q.equals("substr")) {
                int l = R.nextInt();
                int r = R.nextInt();
                System.out.println(str.substring(l - 1, r));
            }

            if (q.equals("sort")) {

                int x = R.nextInt();
                int y = R.nextInt();
                char[] chArr = str.toCharArray();
                Arrays.sort(chArr, x, y);
                str = new String(chArr);
            }
             
            if (q.equals("pop_back")) {
                str = str.substring(0, str.length() - 1);
            }
            
            if (q.equals("back")) {
                System.out.println(str.charAt(str.length() - 1));
            }
            
            if (q.equals("reverse")) {
                int x = R.nextInt();
                int y = R.nextInt();
                // check a error here (y+1)
                String temp = str.substring(x - 1, y+1);
                StringBuilder sb = new StringBuilder(temp);
                sb.reverse();
                str = str.substring(0, x - 1) + sb.toString() + str.substring(y);
            }
            
            if (q.equals("front")) {
                System.out.println(str.charAt(0));
            }
            
            if (q.equals("push_back")) {
                char c = R.next().charAt(0);
                str += c;
                System.out.println(str);
            }

            if (q.equals("print")) {
                int ind = R.nextInt();
                // check a error here (ind - 1)
                System.out.println(str.charAt(ind));
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