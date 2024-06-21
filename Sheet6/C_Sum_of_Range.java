import java.io.*;
import java.util.*;
public class C_Sum_of_Range
{
    private static long sumRange(long A, long B) {
        return (B * (B + 1)) / 2 - ((A - 1) * A) / 2;
    }

    // Function to calculate the summation of even numbers between A and B
    // (inclusive)
    private static long sumEvenRange(long A, long B) {
        if (A % 2 != 0)
            A++; // Make A even if it is odd
        if (B % 2 != 0)
            B--; // Make B even if it is odd
        if (A > B)
            return 0; // No even numbers in range
        long n = (B - A) / 2 + 1;
        return n * (A + B) / 2;
    }

    // Function to calculate the summation of odd numbers between A and B
    // (inclusive)
    private static long sumOddRange(long A, long B) {
        if (A % 2 == 0)
            A++; // Make A odd if it is even
        if (B % 2 == 0)
            B--; // Make B odd if it is even
        if (A > B)
            return 0; // No odd numbers in range
        long n = (B - A) / 2 + 1;
        return n * (A + B) / 2;
    }
    
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
        Scanner scanner = new Scanner(System.in);

        // Read input values for A and B
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        // Ensure A is less than or equal to B
        if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }

        // Calculate the summation of all numbers between A and B (inclusive)
        long sumAll = sumRange(A, B);

        // Calculate the summation of even numbers between A and B (inclusive)
        long sumEven = sumEvenRange(A, B);

        // Calculate the summation of odd numbers between A and B (inclusive)
        long sumOdd = sumOddRange(A, B);

        // Print the results
        System.out.println(sumAll);
        System.out.println(sumEven);
        System.out.println(sumOdd);

        scanner.close();
        
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