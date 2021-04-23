public class oddLengthSubarrays {
    public static void main(String[] args)
    {
        int[] arr={1,4,2,5,3};
        for(int i=0;i<arr.length;i++)
            for(int j=i;j<arr.length;j+=2)
            {
                for(int k=i;k<=j;k++)
                    System.out.print(arr[k]+ " ");
                System.out.println();
            }
    }
}