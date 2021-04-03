import java.util.*;
public class HalloweenSale {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int p=scan.nextInt();
        int d=scan.nextInt();
        int m=scan.nextInt();
        int s=scan.nextInt();

        int count=0;
        while(s>=p)
        {

            s=s-p;
            count++;
            p = Math.max(p-d,m);
        }
        System.out.println(count);
    }
}
