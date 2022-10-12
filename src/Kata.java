import java.util.Arrays;
import java.util.StringJoiner;

public class Kata {
    public static void main(String[] args) {
        System.out.println(expressionsMatter(2, 1, 2));
//        System.out.println(feast("great blue heron", "garlic nann"));
//        System.out.println(Arrays.toString(powersOfTwo(2)));
//        System.out.println(multiTable(5));
//        System.out.println(toBinary(11));
    }

    public static int expressionsMatter(int a, int b, int c) {
        int r1 = a + b + c;
        int r2 = a + b * c;
        int r3 = a * b + c;
        int r4 = a * b * c;
        int r5 = (a + b) * c;
        int r6 = a * (b + c);
        r1 = Math.max(r1, r2);
        r1 = Math.max(r1, r3);
        r1 = Math.max(r1, r4);
        r1 = Math.max(r1, r5);
        r1 = Math.max(r1, r6);

        return r1;
    }

    public static boolean feast(String beast, String dish) {
        boolean x = beast.toCharArray()[0] == dish.toCharArray()[0];
        boolean y = beast.toCharArray()[beast.length() - 1] == dish.toCharArray()[dish.length() - 1];
        return x & y;

    }

    public static long[] powersOfTwo(int n) {
        long[] res = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            res[i] = (long) Math.pow(2, i);
        }
        return res;
    }

    public static String multiTable(int num) {
        StringJoiner result = new StringJoiner("\n");
        for (int i = 1; i < 11; i++) {
            result.add(i + " * " + num + " = " + i * num);
        }
        return result.toString();
    }

    public static int toBinary(int n) {
        String result = Integer.toBinaryString(n);
        return Integer.parseInt(result);
    }
}
