import java.util.Scanner;

public class appleAndOrange {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int t=scan.nextInt();

        int a=scan.nextInt();
        int b=scan.nextInt();

        int m=scan.nextInt();
        int n=scan.nextInt();

        int[] apple=new int[m];
        int[] orange=new int[n];

        int appleCount=0;
        int orangeCount=0;
        int temp=0;

        for(int i=0;i<m;i++)
        {
            apple[i]=scan.nextInt();
            temp=a+apple[i];
            if(temp>=s && temp<=t)
                appleCount+=1;
        }
        for(int i=0;i<n;i++)
        {
            orange[i]=scan.nextInt();
            temp=b+orange[i];
            if(temp>=s && temp<=t)
                orangeCount+=1;
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
