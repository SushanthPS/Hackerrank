import java.util.*;
import java.io.*;
public class equalizeTheArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int n=Integer.parseInt(br.readLine());
        input=br.readLine().split(" ");
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(input[i]);

        Map<Integer,Integer> map=new HashMap<>();

        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);

        int count=0;

        for(int i:map.values())
            if(i>count)
                count=i;

        System.out.println(n-count);

    }
}
