import java.io.*;
import java.util.*;
public class A_Sum_of_Round_Numbers
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

        int t = R.nextInt();

        while ((t--) > 0) {
            
            String str = R.next();
            int x = 0;
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                int n = str.charAt(i) - '0';
                if (n != 0) {
                    count++;
                }
            }
            System.out.println(count);


            for (int i = str.length() - 1; i >= 0; i--) {

                char ch = str.charAt(i);

                int n = ch - '0';

                if (n != 0) {
                    System.out.print((int)(n * Math.pow(10, x)) + " ");
                }
                x++;
            }
            
            System.out.println();
            
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