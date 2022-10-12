public class Sid {
    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(1));
    }

    public static String howMuchILoveYou(int nb_petals) {
        String[] data = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        return data[(nb_petals + 1) % 6 - 1];
    }
}
