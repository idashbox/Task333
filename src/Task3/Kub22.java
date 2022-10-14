package Task3;

public class Kub22 {
    public double xl;
    public double yu;
    public double xr;
    public double yd;
    public Kub22(double xl, double yu, double xr, double yd){
        this.xl = xl;
        this.yu = yu;
        this.xr = xr;
        this.yd = yd;
    }
    public boolean isPointInKub22(double x, double y){

        return (x >= xl && x <= xr) && (y >= yd && y <= yu);
    }
    public boolean isPointNotInKub22(double x, double y){

        return x <= xl || x >= xr || y <= yd || y >= yu;
    }
}
