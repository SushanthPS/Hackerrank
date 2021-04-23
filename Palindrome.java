import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s= scan.next();
        scan.close();
        boolean flag=true;
        for(int i=0;i<=s.length()/2;i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1))
            {
                flag=false;
                System.out.println("No");
                break;
            }
        }
        if(flag)
            System.out.println("Yes");


    }

}

