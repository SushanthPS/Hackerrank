import java.util.*;
public class diamond {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int space=n;space>i;space--)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print(j);
            for(int k=i-1;k>=0;k--)
                System.out.print(k);

            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int space=n;space>i;space--)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print(j);
            for(int k=i-1;k>=0;k--)
                System.out.print(k);
            System.out.println();

        }
    }
}
