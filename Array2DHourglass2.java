import java.util.Scanner;
import java.lang.Math;

public class Array2DHourglass2 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[][] a = new int[6][6];
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<6;i++)
            for(int j=0;j<6;j++)
                a[i][j]=s.nextInt();

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum=a[i][j]  +  a[i][j+1]  +  a[i][j+2]
                             +   a[i+1][j+1] +
                    a[i+2][j]+  a[i+2][j+1]  +  a[i+2][j+2];
                maxSum=Math.max(sum,maxSum);
            }
        }
        System.out.println(maxSum);

    }
}
