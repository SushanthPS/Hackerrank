import java.util.*;
public class countingValleys {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        String s=scan.next();
        int level=0;
        int valley=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='U')
                level++;
            else if(s.charAt(i)=='D')
                level--;

            if(s.charAt(i)=='U' && level==0)
                valley++;

        }

        System.out.println(valley);
    }
}
