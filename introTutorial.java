import java.util.*;
public class introTutorial {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int v=scan.nextInt();
        int n=scan.nextInt();
        int[] arr=new int[n];
        int answer=0;

        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            if(arr[i]==v)
                answer=i;
        }
        System.out.println(answer);
    }
}
