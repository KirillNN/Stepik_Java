import java.util.Arrays;

public class Bio {
    public static void main(String[] args) {
        System.out.println(dnaToRna("", true));
        System.out.println(dnaToRna("TTTT", true));
        System.out.println(dnaToRna("GCAT", true));
        System.out.println(dnaToRna("" ));
        System.out.println(dnaToRna("TTTT"));
        System.out.println(dnaToRna("GCAT" ));
    }

    public static String dnaToRna(String dna) {
        if (dna.equals("")) {
            return "";
        }
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 84) {
                chars[i] = 85;
            }
        }
        return String.valueOf(chars);
    }
    public static String dnaToRna(String dna, boolean x){
        return dna.replace("T", "U");
    }
}
