import java.util.*;
public class repeatedString {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        long n=scan.nextLong();
        int countOfa=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='a')
                countOfa++;

        long multiplier=n/s.length();
        int remainder= (int) (n%s.length());
        long total=multiplier*countOfa;
        for(int i=0;i<remainder;i++)
            if(s.charAt(i)=='a')
                total++;
        System.out.println(total);
    }
}
