public class SharkPontoon {
    public static void main(String[] args) {
        System.out.println(shark(12, 50, 4, 8, true));
        System.out.println(shark(7, 55, 4, 16, true));
        System.out.println(shark(24, 0, 4, 8, true));
    }

    /*
     *
     *  Чтобы результат представлял число с плавающей точкой,
     * один из операндов также должен представлять число с плавающей точкой:
     *
     * При делении стоит учитывать, что если в операции участвуют два целых числа,
     * то результат деления будет округляться до целого числа, даже если результат
     * присваивается переменной float или double:
     *
     * */
    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        double k = dolphin ? 2.0 : 1.0; // Тернарный (тройной) оператор
        double sharkTime = k * sharkDistance / sharkSpeed;
        double youTime = (double) pontoonDistance / youSpeed;
        System.out.println(sharkTime + " " + youTime);
        return youTime < sharkTime ? "Alive!" : "Shark Bait!"; // Don't get eaten!
    }
}
