public class Number {
    public static void main(String[] args) {
        System.out.println(isEven(-4));
    }

    public static boolean isEven(double n) {
        int x = (int) n;
        if (x != n) {
            return false;
        }
        return x % 2 == 0;
    }
}
