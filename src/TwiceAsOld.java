public class TwiceAsOld {
    public static void main(String[] args) {
        System.out.println(TwiceAsOld(45, 30));
        System.out.println(TwiceAsOld(30, 7));
    }

    public static int TwiceAsOld(int dadYears, int sonYears) {
        for (int i = 0; i < 1000; i++) {
            double x = ((double) dadYears - i) / (sonYears - i);
            double y = ((double) dadYears + i) / (sonYears + i);
            if (x == 2 || y == 2) return i;
        }
        return Math.abs((sonYears*2)-dadYears);
    }
}
