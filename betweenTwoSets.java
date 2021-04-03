import java.util.*;
import java.io.*;
public class betweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input;

        input=br.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);

        List<Integer> a=new ArrayList<>(n);
        List<Integer> b=new ArrayList<>(m);

        input=br.readLine().split(" ");
        for(int i=0;i<n;i++)
            a.add(Integer.parseInt(input[i]));

        input=br.readLine().split(" ");
        for(int i=0;i<m;i++)
            b.add(Integer.parseInt(input[i]));

        System.out.println(getTotalX(a,b));

    }
    public static int getTotalX(List<Integer> a,List<Integer> b)
    {
        Set<Integer> c=new HashSet<>();
        for(int i:a)
            c.add(i);
        for(int i:b)
            c.add(i);

        int count=0;
        boolean flag=true;

        for(int x:c)
        {
            for(int i:a)
                if(x%i!=0)
                {
                    flag=false;
                    break;
                }
            if(flag)
                for(int i:b)
                    if(i%x!=0)
                    {
                        flag=false;
                        break;
                    }
            if(flag) {
                count++;
                System.out.println(x);
            }
            flag=true;

        }
        return count;
    }
}
