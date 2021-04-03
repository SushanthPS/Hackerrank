import java.util.*;
public class billDivision
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        int b=scan.nextInt();
        int sum=0;

        for(int i=0;i<n;i++)
            if(i!=k)
                sum+=arr[i];

        sum=sum/2;
        if(b-sum==0)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-sum);

    }
}
