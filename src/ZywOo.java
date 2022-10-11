import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class ZywOo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25})));
    }

    public static int[] multipleOfIndex(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, array);
//        numList.add(1);
//        numList.addAll(array);
        return new int[]{0};
//        numList.removeIf(i -> (i>10&& i<20));
    }
}