public class Paper {
    public static void main(String[] args) {
        System.out.println(paperWork(-1, 5));
    }

    public static int paperWork(int n, int m) {
        return n < 0 || m < 0 ? 0 : n * m;
    }
}
