import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int x1=scan.nextInt();
        int v1=scan.nextInt();
        int x2=scan.nextInt();
        int v2=scan.nextInt();
        scan.close();
        if(v1>v2)
        {
            int t = (x1 - x2) % (v2 - v1);
            if (t == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("NO");


    }
}
