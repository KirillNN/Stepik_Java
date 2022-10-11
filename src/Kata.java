import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
//        System.out.println(feast("great blue heron", "garlic nann"));
        System.out.println(Arrays.toString(powersOfTwo(2)));
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
}
