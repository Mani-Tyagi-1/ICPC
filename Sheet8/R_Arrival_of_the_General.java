import java.io.*;
import java.util.*;
public class R_Arrival_of_the_General
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

        int n = R.nextInt();
        int arr[] = new int[n];

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;


        for (int i = 0; i < n; i++) {
            arr[i] = R.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        int count = 0;
        while (maxIndex > 0) {
            // Swap with left

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[maxIndex - 1];
            arr[maxIndex - 1] = temp;
            maxIndex--;
            count++;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }

        while (minIndex < n-1) {
            // Swap with right
            int temp = arr[minIndex];
            arr[minIndex] = arr[minIndex + 1];
            arr[minIndex + 1] = temp;
            minIndex++;
            count++;
        }

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