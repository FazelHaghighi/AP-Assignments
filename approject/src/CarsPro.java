public class CarsPro {
    public static double t;

    /**
     * @param x1 place of first car
     * @param x2 place of second car
     * @param s1 velocity of first car
     * @param s2 velocity of second car
     * @return when two cars meet
     */
    public static double carst(double x1,double x2,double s1,double s2) {
        double t;
        double deltax = Math.abs(x2 - x1);
        double deltas = Math.abs(s2 - s1);
        t = deltax / deltas;
        return t;
    }

    /**
     * @return where two cars meet
     */
    public static double carsx(double x1,double x2,double s1,double s2) {
        double x;
        x = (s1 * t) + x1;
        return x;
    }

    /**
     * @param s velocity of car
     * @param t spending time
     * @return place of car
     */
    public static double carx(double s,double t){
        double x;
        x = s / t;
        return x;
    }

    /**
     * @param s velocity of car
     * @param x place of car
     * @return time that we need to be arrived in x
     */
    public static double cart(double s,double x){
        double t;
        t = s / x;
        return t;
    }
}
