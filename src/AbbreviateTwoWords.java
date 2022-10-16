import java.util.Locale;

public class AbbreviateTwoWords {
    public static void main(String[] args) {
        System.out.println(abbrevName("sam Harris"));
    }

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        char x = names[0].toUpperCase().toCharArray()[0];
        char y = names[1].toUpperCase().toCharArray()[0];
//        return x + "." + y;
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}
