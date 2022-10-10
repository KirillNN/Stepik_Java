import java.lang.Integer;

public class Lesson_12760 {
    public static void main(String[] args) {
//        System.out.println(charExpression(32));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
        System.out.println(isPowerOfTwo(32));
        System.out.println(isPowerOfTwo(128));
        System.out.println(isPowerOfTwo(-1024));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        String xxx = Integer.toString(value);
//        System.out.println(xxx);
//        System.out.println("value = " + value);
//        value = Math.abs(value);
//        int x = Integer.bitCount(Math.abs(value));
//        System.out.println(x);
//        System.out.println("value (abs) = " + value);
//        String x = Integer.toBinaryString(value);
//        System.out.println("value to string  = " + x);
//        System.out.println(x.bitCount());
//        char[] chars = x.toCharArray()
//        System.out.println(chars);
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
