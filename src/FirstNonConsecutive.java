public class FirstNonConsecutive {
    public static void main(String[] args) {
        System.out.println(find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{31, 32}));
    }

    static Integer find(final int[] array) {
        Integer res = null;
        for (int i = 0; i < array.length - 1; i++) {
//            System.out.println(array[i + 1]);
            if (array[i + 1] - array[i] != 1) {
                res = array[i + 1];
                break;
            }
        }
        return res;
    }
}
