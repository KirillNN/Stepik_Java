public class Job {
    public static void main(String[] args) {
        System.out.println(calc_r(0.5, 0.223, 0.2, 0.4));
        double l1 = calc_r(0.75, 0.23, 0.4, 0.4, true);
        double[] ar_l = {1.93, l1, 2.269, 0.072 / 2};
        double res = 0d;
        for (double x : ar_l) {
            res += x;
        }
        res = Math.round(res * 1000) / 1000d;
        System.out.println("Длина всего пути: " + res);
        System.out.println("Нужно расстояний с шагом 0.6: " + res / 0.6);
        System.out.println("Кол-во Via: " + (int) ((res / 0.6) + 1));
        System.out.println("Шаг Via: " + res / ((int) ((res / 0.6) + 1)));
    }

    public static String calc_r(double radiusRfLine, double widthRfLine, double clearanceToGnd, double outDiaVia) {
        double r = radiusRfLine + widthRfLine / 2 + clearanceToGnd + outDiaVia / 2;
        String res = "Радиус внешней земляной дуги " + r + " мм\n";
        double l = Math.round(2 * Math.PI * r / 4 * 1000) / 1000d;
        res += "Длина 1/4 дуги " + l + " мм";
        return res;
    }

    public static double calc_r(double radiusRfLine, double widthRfLine, double clearanceToGnd, double outDiaVia, boolean ret_double) {
        double r = radiusRfLine + widthRfLine / 2 + clearanceToGnd + outDiaVia / 2;
        double l = Math.round(2 * Math.PI * r / 4 * 1000) / 1000d;
        return l;
    }
}
