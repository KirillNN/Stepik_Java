import java.text.DecimalFormat;

public class Geometry {
    public static void main(String[] args) {
        System.out.println(squareArea(2));
    }

    public static double squareArea(double A) {
        double length = A * 4;  // length = 2 * PI * r
        double r = length / (2 * Math.PI); // r = length/(2*PI)
        return Math.round(r * r * 100d) / 100d;
//        System.out.println(df.format(r * r));
//        DecimalFormat df = new DecimalFormat("#.##");
        //        System.out.println(r);
//        System.out.printf("Value with 3 digits after decimal point %.2f %n", r);
//        return Math.round(r * r);
    }
}
