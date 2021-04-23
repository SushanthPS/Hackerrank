import java.util.*;
public class lowestMode {
    public static void main(String[] args)
    {
        int[] n={1,1,2,2,2,1};
        int ans=-1;
        int count=0;
        int[] c=new int[10];
        for(int i:n)
            c[i]++;

        for(int i=0;i<10;i++)
            if(c[i]>count)
            {
                count=c[i];
                ans=i;
            }
        System.out.println(ans);
    }
}
