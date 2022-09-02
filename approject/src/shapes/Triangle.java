package shapes;

public class Triangle {
//    *
//    *  *
// b  *    *  c
//    *      *
//    * * * * *
//        a

    /**
     * Triangle is a Right triangle.
     * angle between a and b is right.
     * theta is a angle between a and c.
     * phi is a angle between b and c.
     */
    public static double triP(double a, double b){
        double c = Math.sqrt(a*a + b*b);
        return a + b + c;
    }
    public static double triA(double a, double b){
        return (a*b)/2;
    }
    public static double theta(double a, double b){
        return Math.atan2(b, a)*180/Math.PI;
    }
    public static double phi(double a, double b){
        return Math.atan2(a, b)*180/Math.PI;
    }

}

