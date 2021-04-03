import java.util.*;
public class dayOfProgrammer {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();
        String answer;
        if(year==1918)
            answer="26.09.";
        else if (((year<=1917) && (year%4==0)) || ((year>1918) && (year%400==0)) || ((year%4==0) && (year%100!=0)))
            answer="12.09.";
        else
            answer="13.09.";
        System.out.println(answer+year);

    }
}
