import java.util.*;
public class beautifulDayMovie {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        int j=scan.nextInt();
        int k=scan.nextInt();
        int count=0;
        int temp;
        for(;i<=j;i++)
        {
            temp=Math.abs(i-reverse(i));
            if(temp%k==0)
                count++;

        }
        System.out.println(count);
    }

    public static int reverse(int num)
    {
        int digit;
        int rev = 0;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;

        }
        return rev;
    }
}
