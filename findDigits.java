import java.util.*;
public class findDigits {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- > 0)
        {
            int n=scan.nextInt();
            int temp=n;
            int count=0;
            int digit;
            while(temp!=0)
            {
                digit=temp%10;
                if(digit!=0)
                    if(n%digit==0)
                        count++;
                temp=temp/10;


            }
            System.out.println(count);
        }
    }
}
