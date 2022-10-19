import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
//        System.out.println(expressionsMatter(2, 1, 2));
//        System.out.println(feast("great blue heron", "garlic nann"));
//        System.out.println(Arrays.toString(powersOfTwo(2)));
//        System.out.println(multiTable(5));
//        System.out.println(toBinary(11));
//        System.out.println(quarterOf(6));
//        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
//        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
//        System.out.println(find_average(new int[]{1, 2, 3}));
//        System.out.println(greet("Ryan"));
//        System.out.println(solution("world"));
//        System.out.println(seatsInTheater(1000, 1000, 1000, 1000));
//        System.out.println(seatsInTheater(16, 11, 5, 3));
//        System.out.println(nthPower(new int[]{3, 1, 2}, 3));
//        System.out.println(countingSheep(0));
//        System.out.println(getVolumeOfCuboid(1, 2, 2));
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{4, 3, 9, 7, 2, 1})));
    }

    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = (int) Math.pow((int) Math.sqrt(array[i]), 2);
            System.out.println(array[i]);
            System.out.println(x);
            if (x == array[i]) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return array;
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    public static String countingSheep(int num) {
        String res = "";
        for (int i = 0; i < num; i++) {
            res += (i + 1) + " sheep...";
        }
        return res;
    }

    public static int nthPower(int[] array, int n) {
        if (array.length <= n) {
            return -1;
        }
        return (int) Math.pow(array[n], n);
    }

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        int x = nCols - col + 1;
        int y = nRows - row;
        return x * y;
    }

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }

    public static double find_average(int[] array) {
//        return array.length == 0 ? 0 : IntStream.of(array).average().getAsDouble();
        return Arrays.stream(array).average().orElse(0);
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        System.out.println(Arrays.toString(input));
        long x = IntStream.of(input).filter(num -> num > 0).count();
        int y = IntStream.of(input).filter(num -> num < 0).sum();
        return new int[]{(int) x, y};
    }

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }

    public static int quarterOf(int month) {
        return (month - 1) / 3 + 1;
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
