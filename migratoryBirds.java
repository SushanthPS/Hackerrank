import java.util.*;
public class migratoryBirds {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp;
        int[] arr=new int[6];
        int index=0;
        int max=0;

        for(int i=0;i<n;i++)
        {
            temp=scan.nextInt();
            arr[temp]++;
        }
        for(int i=1;i<6;i++)
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        System.out.println(index);
    }
}
