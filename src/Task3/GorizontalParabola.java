package Task3;

public class GorizontalParabola {
    public double x0;
    public double y0;
    public double a;
    public GorizontalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }
    public boolean isPointInParabolaG(double x, double y) {
        return x >= a * Math.pow(y - y0, 2)  + x0;
    }
    public boolean isPointNotInParabolaG(double x, double y) {

        return x <= a * Math.pow(y - y0, 2) + x0;
    }
}

