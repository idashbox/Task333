package Task3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double x = getX();
        double y = getY();
        System.out.println(getColor(x, y));
    }
    public static Scanner scanner = new Scanner(System.in);
    public static VerticalParabola P1 = new VerticalParabola(3, 1, 1);
    public static GorizontalParabola P2 = new GorizontalParabola(-3, -4, 1);
    public static Rectangle89 R1 = new Rectangle89(-3, 8, 5, -1);
    public static Rectangle79 R2 = new Rectangle79(-3, 9, 4, 0);
    public static Rectangle25 R3 = new Rectangle25(1, 2, 3, -3);
    public static Kub22 K1 = new Kub22(1, 2, 3, 0);

    public static Colors getColor(double x, double y) {
        if (P2.isPointInParabolaG(x, y) && R3.isPointInRectangle25(x, y)) {
            return Colors.ORANGE;
        }
        if (P2.isPointInParabolaG(x, y) && R3.isPointNotInRectangle25(x, y)) {
            return Colors.YELLOW;
        }
        if (P1.isPointInParabolaV(x, y) && K1.isPointInKub22(x, y)) {
            return Colors.ORANGE;
        }
        if (P1.isPointInParabolaV(x, y) && (R1.isPointInRectangle89(x, y) && R2.isPointInRectangle79(x, y)) && K1.isPointNotInKub22(x, y)) {
            return Colors.BLUE;
        }
        if (R1.isPointInRectangle89(x, y) && R2.isPointNotInRectangle79(x, y) && R3.isPointNotInRectangle25(x, y)) {
            return Colors.YELLOW;
        }
        if (K1.isPointInKub22(x, y) && R1.isPointInRectangle89(x, y) && P1.isPointNotInParabolaV(x, y)){
            return Colors.GRAY;
        }
        if (K1.isPointNotInKub22(x, y) && P2.isPointNotInParabolaG(x, y) && P1.isPointNotInParabolaV(x, y) && R3.isPointInRectangle25(x, y) && x <= 3){
            return Colors.GREEN;
        }
        if (K1.isPointNotInKub22(x, y) && P1.isPointNotInParabolaV(x, y) && R1.isPointInRectangle89(x, y) && x <= 3) {
            return Colors.GREEN;
        }
        if (R2.isPointInRectangle79(x, y) && P1.isPointNotInParabolaV(x, y)){
            return Colors.ORANGE;
        }
        if (R2.isPointInRectangle79(x, y) && y >= 8){
            return Colors.ORANGE;
        }
        if (P1.isPointInParabolaV(x, y) && R1.isPointNotInRectangle89(x, y) && R2.isPointNotInRectangle79(x, y)) {
            return Colors.GRAY;
        }
        if (((x <= 1) || (x >= 1 && y <= -6)) && P2.isPointNotInParabolaG(x, y) && R1.isPointNotInRectangle89(x, y) && R2.isPointNotInRectangle79(x, y) && P1.isPointNotInParabolaV(x, y)){
            return Colors.ORANGE;
        }else{
            return Colors.WHITE;
        }
    }
    static double getX() {
        System.out.println("Введите значение x:");
        double num;
        num = scanner.nextDouble();
        return num;
    }
    static double getY() {
        System.out.println("Введите значение y:");
        double num;
        num = scanner.nextDouble();
        return num;
    }
}
