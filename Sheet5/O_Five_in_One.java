import java.io.*;
import java.util.*;
public class O_Five_in_One
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

    public static boolean checkPrime(int n) {

        if (n == 1)
            return false;
        if (n == 2)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        
        for (int i = 5; i*i < n; i+=5) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(int n) {
        int n1 = n;
        int rev = 0;

        while (n1 != 0) {
            int d = n1 % 10;
            n1 = n1 / 10;

            rev = (rev * 10) + d;
        }

        if (rev == n)
            return true;
        return false;
    }

    public static int divisor(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count;
    } 
    
    public static void solve()
    {
        Reader R = new Reader();

        int n = R.nextInt();
        int arr[] = new int[n];
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countPrime = 0;
        int countPalindrome = 0;
        int countDivisor = 0;
        int ansDiv = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = R.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            if (checkPrime(arr[i]))
                countPrime++;
            if (checkPalindrome(arr[i]))
                countPalindrome++;

            if (divisor(arr[i]) >= countDivisor) {
                countDivisor = divisor(arr[i]);
                ansDiv=Math.max(ansDiv,arr[i]);
            }
        }
        System.out.println("The maximum number : "+max);
        System.out.println("The minimum number : "+min);
        System.out.println("The number of prime numbers : "+countPrime);
        System.out.println("The number of palindrome numbers : "+countPalindrome);
        System.out.println("The number that has the maximum number of divisors : "+ansDiv);
        

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