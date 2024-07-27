import java.io.*;
import java.util.*;
public class Y_Team_Olympiad
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
        Reader sc = new Reader();
        
        int n = sc.nextInt();

        int arr[] = new int[n];

        List<Integer> programmers = new ArrayList<>();
        List<Integer> sports = new ArrayList<>();
        List<Integer> mathmatician = new ArrayList<>();
       

        

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            

            if (arr[i] == 1)
                programmers.add(i+1);
            if (arr[i] == 2)
                mathmatician.add(i+1);
            if (arr[i] == 3)
                sports.add(i+1);
        }
        
        int team = Math.min(programmers.size(), mathmatician.size());
        team = Math.min(team, sports.size());

        System.out.println(team);

        for (int i = 0; i < team; i++) {
            System.out.println(programmers.get(i) + " " + mathmatician.get(i) + " " + sports.get(i));
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