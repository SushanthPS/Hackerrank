import java.math.*;
import java.util.*;

public class bigInteger {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger bg=new BigInteger("1");
        for(int i=1;i<=n;i++)
            bg=bg.multiply(BigInteger.valueOf(i));

        System.out.println(bg);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}