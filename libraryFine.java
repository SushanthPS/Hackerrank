import java.util.*;
public class libraryFine {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int d1=scan.nextInt();
        int m1=scan.nextInt();
        int y1=scan.nextInt();

        int d2=scan.nextInt();
        int m2=scan.nextInt();
        int y2=scan.nextInt();

        int fine = 0;

        if(y1>y2)
            fine=10000;
        else
        {
            if(m1>m2)
                fine=500*(m1-m2);
            else
            {
                if(d1>d2)
                    fine=15*(d1-d2);
            }
        }

        if(y1<y2)
            fine=0;
        if(y1==y2 && m1<m2)
            fine=0;
        if(y1==y2 && m1==m2 && d1<d2)
            fine=0;



        System.out.println(fine);



    }
}
