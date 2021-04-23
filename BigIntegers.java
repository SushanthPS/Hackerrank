import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BigIntegers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();
        s.close();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}