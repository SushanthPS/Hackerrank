import java.util.*;
public class hashSets
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        HashSet<Integer> color=new HashSet<>(n);
        int pairs=0;
        int temp;
        for(int i=0;i<n;i++)
        {
            temp=scan.nextInt();
            if(!color.contains(temp))
                color.add(temp);
            else
            {
                pairs++;
                color.remove(temp);
            }


        }
        System.out.println(pairs);
    }
}
