import java.util.stream.IntStream;

public class GrassHopper {
    public static void main(String[] args) {
//        System.out.println(summation(5));
        System.out.println(getGrade(95, 90, 93, true));
        System.out.println(weatherInfo(50));
    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * 5 / 9.0;
        return celsius;
    }

    public static char getGrade(int s1, int s2, int s3, boolean x) {
        return switch ((s1 + s2 + s3) / 30) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }

    public static char getGrade(int s1, int s2, int s3) {
        double x = (s1 + s2 + s3) / 3.0;
        if (x >= 90 && x <= 100) {
            return 'A';
        } else if (x >= 80 && x < 90) {
            return 'B';
        } else if (x >= 70 && x < 80) {
            return 'C';
        } else if (x >= 60 && x < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static int summation(int n) {
        return IntStream.range(1, n + 1).sum();
    }
}
