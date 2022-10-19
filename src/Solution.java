import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(4, 4));
        System.out.println(areaOrPerimeter(6, 10));
        System.out.println(check(new Object[]{66, 101}, 66));
        System.out.println(check(new Object[]{"what", "a", "great", "kata"}, "kat"));
    }
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
//    public static boolean check(Object[] a, Object x) {
//        for (Object a_i : a) {
//            if (a_i == x) return true;
//        }
//        return false;
//    }

    public static int areaOrPerimeter(int l, int w) {
        return l == w ? l * w : 2 * (l + w);
    }
}