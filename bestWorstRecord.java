import java.util.*;
public class bestWorstRecord {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        arr[0]=scan.nextInt();
        int min=arr[0],max=arr[0];
        int minCount=0,maxCount=0;
        for(int i=1;i<n;i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > max)
            {
                max=arr[i];
                maxCount++;
            }
            else if(arr[i] < min)
            {
                min = arr[i];
                minCount++;
            }

        }
        System.out.println(maxCount+" "+minCount);
    }
}
