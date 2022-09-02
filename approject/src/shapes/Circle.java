package shapes;

/**
 * Circle has a radius (r).
 */
public class Circle {
    public static double PI = 3.14;
    public static double cirP(double r){
        return 2 * PI * r;
    }
    public static double cirA(double r){
        return r * r * PI;
    }
}
