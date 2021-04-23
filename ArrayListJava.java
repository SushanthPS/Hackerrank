import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListJava {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d, q, x, y;
        ArrayList<Integer>[] set = new ArrayList[n];
        for (int i = 0; i < n; i++)
        {
            d=scan.nextInt();
            set[i]=new ArrayList<Integer>(d);
            for(int j=0;j<d;j++)
                set[i].add(scan.nextInt());
        }
        q = scan.nextInt();
        for(int i=0;i<q;i++)
        {
            x = scan.nextInt();
            y = scan.nextInt();
            try
            {
                System.out.println(set[x-1].get(y-1));
            }
            catch (Exception e)
            {
                System.out.println("ERROR!");
            }
        }

    }
}
