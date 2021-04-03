import java.util.*;
public class catAndMouse {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int q=scan.nextInt();
        while(q-- > 0)
        {
            int x=scan.nextInt();
            int y=scan.nextInt();
            int z=scan.nextInt();
            int x1=Math.abs(x-z);
            int y1=Math.abs(y-z);

            if(x1<y1)
                System.out.println("Cat A");
            else if(y1<x1)
                System.out.println("Cat B");
            else
                System.out.println("Mouse C");
        }

    }
}
