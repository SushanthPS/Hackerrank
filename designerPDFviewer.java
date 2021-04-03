import java.util.*;
public class designerPDFviewer {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[26];
        for(int i=0;i<26;i++)
            arr[i]=scan.nextInt();
        String word=scan.next();
        int temp;
        int length=word.length();
        int maxHeight=0;

        for(int i=0;i<length;i++)
        {
            temp=word.charAt(i)-97;
            if(arr[temp]>maxHeight)
                maxHeight=arr[temp];

        }
        System.out.println(maxHeight*length);

    }
}
