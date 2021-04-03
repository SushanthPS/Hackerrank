import java.awt.List;
import java.util.*;
public class chocolateFeast {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- > 0)
        {
            int n=scan.nextInt();
            int c=scan.nextInt();
            int m=scan.nextInt();

            int wrappers=n/c;
            int count=n/c;
            while(wrappers>=m)
            {
                int candyFromWrap=wrappers/m;
                wrappers=candyFromWrap+wrappers%m;
                count+=candyFromWrap;

            }
            System.out.println(count);
        }

    }
}
