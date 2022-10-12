public class CodeWars {
    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'o'));
        System.out.println(strCount("", 'o'));
    }

    public static int strCount(String str, char letter) {
//        char[] chars = str.toCharArray();
        //        System.out.println(occurrencesCount);
        return (int) str.chars().filter(ch -> ch == letter).count();
    }
}
