import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        System.out.println(sum(new double[] {}));
    }
    public static double sum(double[] numbers) {
        return numbers.length == 0 ? 0 : Arrays.stream(numbers).sum();
    }
}
