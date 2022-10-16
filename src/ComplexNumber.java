import java.lang.Double;
import java.util.Objects;

public final class ComplexNumber {
    public static void main(String[] args) {
        ComplexNumber x1 = new ComplexNumber(2.5,3.5);
        ComplexNumber x2 = new ComplexNumber(2.5,3.5);
        boolean y = x1.equals(x2);
        System.out.println(y);
    }
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Object d = getClass();
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumber that = (ComplexNumber) obj;
        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}

