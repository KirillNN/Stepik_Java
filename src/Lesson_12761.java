public class Lesson_12761 {
    public static void main(String[] args) {
        step8();
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

    public static void step8() {
        System.out.println('A' + '1' + "2");
        System.out.println("A" + 12);
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println('A' + "12");

    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        text = text.toLowerCase();
        StringBuilder text_reverse = new StringBuilder(text);
        text_reverse.reverse();
        return text.equals(text_reverse.toString());
    }
}
