import java.util.ArrayList;
import java.util.Scanner;

public class gradingStudents {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(n);
        int mark = 0;
        for(int i=0;i<n;i++)
        {
            arr.add(scan.nextInt());
            if(arr.get(i)<38 || arr.get(i)%5<3)
                mark=arr.get(i);
            else if(arr.get(i)%5>2)
                mark=arr.get(i)+(5-(arr.get(i)%5));
            System.out.println(mark);
        }
    }
}
