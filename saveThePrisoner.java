import java.util.*;
public class saveThePrisoner {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int s = scan.nextInt();

            int answer = (m+s-1) % n;
            if(answer==0)
                answer=n;
            System.out.println(answer);
        }
    }
}
