import java.util.*;
import java.io.*;
public class minimumAbsoluteDifferenceInArray {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] input=br.readLine().split(" ");
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(input[i]);

        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=1;i<n;i++)
        {
            int i1 = arr[i] - arr[i - 1];
            if(i1 <min)
                min= i1;
            if(min==0)
                break;

        }

        System.out.println(min);

    }
}
