public class Sid {
    public static void main(String[] args) {
//        System.out.println(howMuchILoveYou(1));
        System.out.println(simpleMultiplication(1));
    }

    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }

    public static String howMuchILoveYou(int nb_petals) {
        String[] data = {"not at all", "I love you", "a little", "a lot", "passionately", "madly"};
        return data[nb_petals % 6];
    }

}
