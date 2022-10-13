import java.math.BigInteger;

public class WilsonPrime {
    public static void main(String[] args) {
//        System.out.println(am_i_wilson(0));
//        System.out.println(am_i_wilson(1));
//        System.out.println(am_i_wilson(5));
//        System.out.println(am_i_wilson(13));
        System.out.println(am_i_wilson(100000));
    }

    public static BigInteger factorial(double number) {
        BigInteger factorial = BigInteger.ONE;
        for (double i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf((long) i));
        }
        return factorial;
    }

    public static boolean am_i_wilson(double n) {
        if (n < 2) {
            return false;
        }
        BigInteger tmp = factorial((int) n - 1);
        System.out.println(tmp);
        BigInteger n1 = (factorial((n - 1)).add(BigInteger.ONE)).mod(BigInteger.valueOf((long) n * (long) n));
//        System.out.println(n1);
        return n1.equals(BigInteger.ZERO);
    }
}
