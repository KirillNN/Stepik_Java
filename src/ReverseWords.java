import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("I like eating"));
    }

    public static String reverseWords(String str) {
        List<String> x = new java.util.ArrayList<>(List.of(str.split(" ")));
        Collections.reverse(x);
        return String.join(" ", x);
    }
}
