public class Cockroach {
    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.09));
    }

    public static int cockroachSpeed(double x) {
        return (int) (x * 100_000 / 3_600);
    }
}
