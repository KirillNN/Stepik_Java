public class CodeWarsMath {
    public static void main(String[] args) {
        System.out.println(nearestSq(1));
        System.out.println(nearestSq(2));
        System.out.println(nearestSq(10));
        System.out.println(nearestSq(111));
        System.out.println(nearestSq(9999));
    }

    public static int nearestSq(final int n) {
        int n_sqrt = (int) Math.sqrt(n);
        int left = n_sqrt * n_sqrt; // left value
        int right = (n_sqrt + 1) * (n_sqrt + 1); // right value
        if (Math.abs(left - n) < Math.abs(right - n)) {
            return left;
        } else {
            return right;
        }
    }
}