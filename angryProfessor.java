import java.util.*;
public class angryProfessor {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- > 0)
        {
            int n=scan.nextInt();
            int k=scan.nextInt();
            int[] arr=new int[n];
            int count=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
                if(arr[i]<=0)
                    count++;
            }
            if(count>=k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
