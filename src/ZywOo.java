import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ZywOo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25})));
        System.out.println(Arrays.toString(multipleOfIndex1(new int[]{22, -6, 32, 82, 9, 25})));
    }

    public static int[] multipleOfIndex(int[] array) {
//        List<Integer> list = Arrays.stream(array).boxed().toList();
        List<Integer> intList = new ArrayList<>(array.length);
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                intList.add(array[i]);
            }
        }
        int[] res = new int[intList.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = intList.get(i);
        return res;
    }

    public static int[] multipleOfIndex1(int[] a) {
        return IntStream.range(1, a.length).filter(i -> a[i] % i == 0).map(i -> a[i]).toArray();
    }
}