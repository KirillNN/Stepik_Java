import java.math.BigInteger;
import java.util.Arrays;

public class Lesson_12762 {
    public static void main(String[] args) {
//        System.out.println(factorial(10));
//        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 2, 3}, new int[]{0})));
//        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 3}, new int[]{0, 2, 2})));
//        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 2}, new int[]{0, 2, 3})));
//        System.out.println(Arrays.toString(mergeArrays(new int[]{}, new int[]{1, 3})));
//        System.out.println(printTextPerRole());
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger x = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            x = x.multiply(BigInteger.valueOf(i));
        }
        return x;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        System.err.println(Arrays.toString(a1));
        System.err.println(Arrays.toString(a2));
        if (a1.length == 0) {
            return a2;
        }
        if (a2.length == 0) {
            return a1;
        }
        int[] result = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < (a1.length + a2.length); ) {
            if (a1.length == i & a2.length == j){
                break;
            }
            if (a1.length == i){
                result[k] = a2[j];
                j++;
                k++;
                continue;
            }
            if (a2.length == j){
                result[k] = a1[i];
                i++;
                k++;
                continue;
            }
            if (a1[i] < a2[j]) {
                result[k] = a1[i];
                i++;
                k++;
            } else if (a1[i] > a2[j]) {
                result[k] = a2[j];
                j++;
                k++;
            } else {
                result[k] = a2[j];
                k++;
                j++;
                result[k] = a1[i];
                k++;
                i++;
            }
        }

        return result;
    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder answer = new StringBuilder();
        for (String role : roles) {
            answer.append(role + ":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    answer.append((i+1) + ")" + textLines[i].substring(role.length() + 1) + "\n");
                }
            }
            answer.append("\n");
        }
        return answer.toString();
    }
}
