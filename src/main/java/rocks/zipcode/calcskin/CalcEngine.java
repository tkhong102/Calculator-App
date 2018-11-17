package rocks.zipcode.calcskin;

public class CalcEngine {

    CalcEngine() {
    }

    public double add(double v, double v1) { return v + v1; }

    public double subtract(double v, double v1) {
        return v-v1;
    }

    public double multiply(double v, double v1) {
        return v*v1;
    }

    public double divide(double v, double v1) {
        return v/v1;
    }

    public double square(double v) {return v*v;}

    public double squareroot(double v) { return Math.sqrt(v);}

    public double exponent(double v, double v1) { return Math.pow(v, v1); }

    public double inverse(double v) { return (1 / v); }

    public double invert(double v) { return (-v); }

    public double findSin(double v) { return Math.sin(v); }

    public double findCos(double v) { return Math.cos(v); }

    public double findTan(double v) { return Math.tan(v); }
}
