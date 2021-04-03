import java.util.*;
public class perfectSquare {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int low=0;
        int high=n;
        int mid;
        boolean flag=false;
        while(low<=high)
        {
            mid=(low+high)/2;
            System.out.println(low+" "+high+" "+mid);
            if(mid*mid==n)
            {
                flag=true;
                break;
            }
            else if(mid*mid>n)
                high=mid-1;
            else if(mid*mid<n)
                low=mid+1;
        }

        if(flag)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");

    }
}
