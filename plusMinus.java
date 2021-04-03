import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class plusMinus {

    // Complete the plusMinus function below.
    static void plusMinuss(int[] arr) {
        double plus=0,minus=0,zero=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                zero+=1;
            else if(arr[i]>0)
                plus+=1;
            else if(arr[i]<0)
                minus+=1;
        }
        System.out.printf("%.6f \n",plus/n);
        System.out.printf("%.6f \n",minus/n);
        System.out.printf("%.6f \n",zero/n);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinuss(arr);

        scanner.close();
    }
}
