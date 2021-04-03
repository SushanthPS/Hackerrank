import java.util.*;
public class drawingBook {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int p=scan.nextInt();
        int lastPage=n/2;
        int pageFromFront=p/2;
        int pageFromBack=lastPage-pageFromFront;
        System.out.println(Math.min(pageFromBack,pageFromFront));
    }
}
