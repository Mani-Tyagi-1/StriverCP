import java.io.*;
import java.util.*;
public class A_Nearly_Lucky_Number
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

        long num = R.nextLong();

        long count = 0;
        boolean flag = true;

        while (num != 0) {
            long d = num % 10;
            num = num / 10;

            if (d == 7 || d == 4) {
                count++;
            } else {
                flag = false;
                break;

            }
        }
        

        if (count != 7 && count != 4 || flag == false) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
        
        // if (flag) {
        //     while (count != 0) {
        //         long d = count % 10;
        //         count = count / 10;

        //         if (d != 4 && d != 7) {
        //             flag = false;
        //             break;
        //         }
        //     }
        // }
        
        // if (flag) {
        //     System.out.println("YES");
        // }
        // else {
        //     System.out.println("NO");
        // }
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