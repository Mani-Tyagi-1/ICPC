import java.io.*;
import java.util.*;
public class R_String_Score
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

        long len = R.nextLong();
        String str = R.nextLine();
        // StringBuilder sb = new StringBuilder(str);
        // int n = 0;
        
        // for (int i = 0; i < sb.length(); i++) {
        //     char ch = sb.charAt(i);
            
        //     switch (ch) {
        //         case 'V':
        //             n = n + 5;
        //             break;
        //         case 'W':
        //             n = n + 2;
        //             break;
        //         case 'X':
                
        //             if (i + 1 < sb.length()) {
        //                 sb.deleteCharAt(+1);
        //             }
        //             break;
        //         case 'Y':
                    
        //             if (i + 1 < sb.length()) {
        //                 char temp = sb.charAt(i + 1);
        //                 sb.deleteCharAt(i + 1);
        //                 sb.append(temp);
        //             }
        //             break;
        //         case 'Z':
        //             if (i + 1 < sb.length()) {
        //                 char temp = sb.charAt(i + 1);
        //                 if (temp == 'V') {
        //                     n = n / 5;
        //                     sb.deleteCharAt(i+1);
        //                 }
        //                 else if ( temp == 'W') {
        //                     n = n / 2;
        //                     sb.deleteCharAt(i + 1);
        //                 }
        //             }
        //             break;
            
        //         default:
        //             break;
        //     }
            
        // }
        // System.out.println(n);


        LinkedList<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        int score = 0;

        while (!list.isEmpty()) {
            char current = list.removeFirst();

            switch (current) {
                case 'V':
                    score += 5;
                    break;
                case 'W':
                    score += 2;
                    break;
                case 'X':
                    if (!list.isEmpty()) {
                        list.removeFirst(); // Remove the next consecutive character
                    }
                    break;
                case 'Y':
                    if (!list.isEmpty()) {
                        char next = list.removeFirst();
                        list.addLast(next); // Move the next consecutive character to the end of the string
                    }
                    break;
                case 'Z':
                    if (!list.isEmpty()) {
                        char next = list.peekFirst();
                        if (next == 'V') {
                            score /= 5;
                            list.removeFirst(); // Remove the next consecutive character
                        } else if (next == 'W') {
                            score /= 2;
                            list.removeFirst(); // Remove the next consecutive character
                        }
                    }
                    break;
            }
        }

        System.out.println(score);

        
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