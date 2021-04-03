import java.util.*;
public class electronicsShop {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int b=scan.nextInt();
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[] keyboard=new int[n];
        int[] drives=new int[m];

        for(int i=0;i<n;i++)
            keyboard[i]=scan.nextInt();
        for(int i=0;i<m;i++)
            drives[i]=scan.nextInt();

        int total=0;
        int temp;

        for(int keys:keyboard)
        {
            for(int drive:drives)
            {
                temp=keys+drive;
                if(temp>total && temp<=b)
                    total = temp;



            }
        }
        if(total==0)
            System.out.println("-1");
        else
            System.out.println(total);

    }
}
