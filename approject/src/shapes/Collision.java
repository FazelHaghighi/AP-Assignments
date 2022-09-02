package shapes;

public class Collision {

    /**
     * function shows that two rectangle have collision or not.
     * @param x11 is the leftmost x for first rectangle.
     * @param y11 is the lowest y for first rectangle.
     * @param a1 is the length of first rectangle.
     * @param b1 is the width of first rectangle.
     * @param x21 is the leftmost x for second rectangle.
     * @param y21 is the lowest y for second rectangle.
     * @param a2 is the length of second rectangle.
     * @param b2 is the width of first rectangle.
     */
    public static String RecColl(int x11, int y11, int a1, int b1, int x21, int y21, int a2, int b2){
        String ans = "No";
        int x12 = x11 + a1;
        int y12 = y11 + b1;
        int x22 = x21 + a2;
        int y22 = y21 + b2;
        if((((x21 >= x11) && (x21 <= x12)) || ((x22 >= x11) && (x22 <= x12))) && (((y21 >= y11) && (y21 <= y12)) || ((y22 >= y11) && (y22 <= y12))))
            ans = "Yes";
        return ans;
    }
}
