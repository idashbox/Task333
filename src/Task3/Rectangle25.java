package Task3;

public class Rectangle25 {
    public double xl;
    public double yu;
    public double xr;
    public double yd;
    public Rectangle25(double xl, double yu, double xr, double yd){
        this.xl = xl;
        this.yu = yu;
        this.xr = xr;
        this.yd = yd;
    }
    public boolean isPointInRectangle25(double x, double y){
        return (x >= xl && x <= xr) && (y >= yd && y <= yu);
    }
    public boolean isPointNotInRectangle25(double x, double y){
        return x <= xl || x >= xr || y <= yd || y >= yu;
    }
}
