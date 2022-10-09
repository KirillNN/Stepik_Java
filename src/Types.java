public class Types {
    public static void main(String[] args) {
        byte a = 127;
        int r = ~a;
        System.out.println(r);
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        System.out.println(String.format("%s %s %s %s", a, b, c, d));
        char omega = '\u03A9';
        System.out.println(omega);
        System.out.println(Math.PI);
    }
}
