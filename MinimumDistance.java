import java.util.*;
public class MinimumDistance {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();

        boolean flag=false;

        int distance=Integer.MAX_VALUE,minDistance=Integer.MAX_VALUE;

        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    distance=j-i;
                    flag=true;
                }
                minDistance=Math.min(distance,minDistance);
            }
        if(flag)
            System.out.println(minDistance);
        else
            System.out.println("-1");

    }
}
