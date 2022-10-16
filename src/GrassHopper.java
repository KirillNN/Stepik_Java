import java.util.stream.IntStream;

public class GrassHopper {
    public static void main(String[] args) {
        System.out.println(summation(5));
    }

    public static int summation(int n) {
        return IntStream.range(1, n + 1).sum();
    }
}
