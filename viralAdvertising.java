import java.util.*;
public class viralAdvertising {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int shared=5,liked=0,totalLikes=0;
        while(n-- > 0)
        {
            liked=shared/2;
            totalLikes+=liked;
            shared=liked*3;

        }
        System.out.println(totalLikes);
    }
}
