public class Points {

    /**
     * every point in 1D space has x in cartesian coordinate system.
     * Distance Between two points 1D
     * @param x1
     * @param x2
     * @return Distance
     */
    public static double point(double x1,double x2){
        double d = Math.abs(x2 - x1);
        return d;
    }

    /**
     * every point in 2D space has x and y in cartesian coordinate system.
     * Distance Between two points 2D
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return Distance
     */
    public static double point2D(double x1,double y1,double x2,double y2){
        double d = Math.sqrt(Math.pow(x2 - x1,2)+Math.pow(y2 - y1,2));
        return d;
    }

    /**
     * every point in 3D space has x and y and z.
     * Distance Between two points 3D
     * @param x1
     * @param y1
     * @param z1
     * @param x2
     * @param y2
     * @param z2
     * @return Distance
     */
    public static double point3D(double x1,double y1,double z1,double x2,double y2,double z2){
        double d =(double) Math.sqrt(Math.pow(x2 - x1,2)+Math.pow(y2 - y1,2)+Math.pow(z2 - z1,2));
        return d;
    }

    /**
     * every point in 3D space has ρ and θ and φ in Spherical coordinate system.
     * x = ρ * sinφ * cosθ
     * y = ρ * sinφ * sinθ
     * z = ρ * cosφ
     * Distance Between two points in a Sphere.
     * @param x1
     * @param y1
     * @param z1
     * @param x2
     * @param y2
     * @param z2
     * @param r
     * @return Distance
     */
    public static double sphere(double x1,double y1,double z1,double x2,double y2,double z2,double r){
        double t = (x1 * x2) + (y1 * y2) + (z1 * z2);
        double d = r * Math.acos((t / Math.pow(r,2)));
        return d;
    }

    /**
     * Distance Between Line and Point
     */
    public static double Line_Point(double a,double b,double c,double x,double y){
        double d = (Math.abs((a * x)+(b * y) + c)/Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
        return d;
    }
}
