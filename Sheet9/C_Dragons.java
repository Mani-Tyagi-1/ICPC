import java.io.*;
import java.util.*;
public class C_Dragons
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
        long strength = R.nextLong();
        long noOfDragons = R.nextLong();

        long mat[][] = new long[(int)noOfDragons][2];

        for (int i = 0; i < noOfDragons; i++) {
            mat[i][0] = R.nextLong(); // strength
            mat[i][1] = R.nextLong(); // boonus
        }
        
        Arrays.sort(mat, (a, b) -> (int)a[0] - (int)b[0]);

        boolean flag = true;

        for (int i = 0; i < noOfDragons; i++) {
            if (strength > mat[i][0]) {
                strength += mat[i][1];
            } else {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
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