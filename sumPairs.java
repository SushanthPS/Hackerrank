import java.util.*;
public class sumPairs {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        int pairs=0;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
                if((arr[i]+arr[j])%k==0)
                    pairs++;
        }
        System.out.println(pairs);
    }
}
