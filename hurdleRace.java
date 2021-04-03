import java.util.*;
public class hurdleRace {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int max=0;
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            if(arr[i]>max)
                max=arr[i];
        }

        if(k>max)
            System.out.println("0");
        else
            System.out.println(max-k);
    }
}
