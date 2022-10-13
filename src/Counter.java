import java.util.Arrays;
import java.util.Objects;

public class Counter {
    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[]{true, true, true, null, true, true, false}, true));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int res = 0;
        for (Boolean x : arrayOfSheeps) {
            if (x != null && x) res++;
        }
        return res;
    }

    public static int countSheeps(Boolean[] arrayOfSheeps, boolean bool) {
        // TODO May the force be with you
        return Arrays.stream(arrayOfSheeps).filter(Objects::nonNull).filter(x -> x).toArray().length;
    }
}
