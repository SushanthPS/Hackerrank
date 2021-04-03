import java.util.*;
public class pickingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int result=0;

        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        int[] freq = new int[100];

        for(int i=0;i<n;i++)
            freq[arr[i]]++;

        for(int i=0;i<99;i++)
            result = Math.max(result,freq[i]+freq[i+1]);

        System.out.println(result);


    }
}

