import java.io.*;
import java.util.*;
public class Z_Left_Max
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        // Reader sc = new Reader();
        // int t = sc.nextInt();
        // while (t-- > 0) {
            solve();
        // }
        // out.close();
    }
    
    public static int findMaxUpToIndex(int[] A, int[] maxArray, int i) {
        // Base case: If i is 0, the maximum is the first element itself
        if (i == 0) {
            maxArray[i] = A[i];
            return A[i];
        }

        // Recursive case: Calculate the maximum up to the previous index
        int maxSoFar = findMaxUpToIndex(A, maxArray, i - 1);

        // Find the maximum up to the current index
        maxArray[i] = Math.max(maxSoFar, A[i]);

        return maxArray[i];
    }

    public static void solve()
    {
        Reader sc=new Reader();

        // Read the number of elements
        int N = sc.nextInt();

        // Read the elements into the array
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Call the recursive function and print the results
        int[] maxArray = new int[N];
        findMaxUpToIndex(A, maxArray, N - 1);

        // Print the result
        for (int i = 0; i < N; i++) {
            System.out.print(maxArray[i] + " ");
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