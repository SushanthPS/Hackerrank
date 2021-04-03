import java.util.*;
public class subArrayDivision {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        int d=scan.nextInt();
        int m=scan.nextInt();
        int answer=0;
        int sum=0;

        for(int i=0;i<n-m+1;i++)
        {
            for(int j=i;j<i+m;j++)
                sum+=arr[j];
            if(sum==d)
                answer+=1;
            sum=0;
        }
        System.out.println(answer);


    }
}
