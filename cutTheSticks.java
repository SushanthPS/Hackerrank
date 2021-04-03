import java.io.*;
import java.util.*;
public class cutTheSticks {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        input=br.readLine().split(" ");


        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(input[i]);

        Arrays.sort(arr);
        System.out.println(n);

        for(int i=1;i<n;i++)
            if(arr[i]!=arr[i-1])
                System.out.println(n-i);



    }
}
