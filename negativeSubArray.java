import java.util.*;

public class negativeSubArray
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0, sum = 0;
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        for (int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                sum+=arr[j];
                if(sum<0)
                    count++;
            }
            sum=0;
        }
        System.out.println(count);

    }
}
