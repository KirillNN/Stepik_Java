import java.util.Arrays;

public class WrongEndHead {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fixTheMeerkat(new String[]{"tail", "body", "head"})));
    }

    public static String[] fixTheMeerkat(String[] arr) {
        String first = arr[0];
        String last = arr[arr.length - 1];
        arr[0] = last;
        arr[arr.length - 1] = first;
        return arr;
    }

}

