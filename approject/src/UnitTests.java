import contacts.Main;
import shapes.Circle;
import shapes.Collision;
import shapes.Rectangle;
import shapes.Triangle;
import org.testng.annotations.Test;
import vehicle.Vehicle;

import static org.testng.Assert.assertEquals;
public class UnitTests {
    @Test
    public void Date_test() {
        assertEquals("2022/1/5 | Sunday", DatePro.Date(5));
        assertEquals("2022/2/1 | Saturday", DatePro.Date(32));
        assertEquals("2022/4/7 | Thursday", DatePro.Date(100));
        assertEquals("2022/9/10 | Saturday", DatePro.Date(256));
        assertEquals("2022/12/16 | Wednesday", DatePro.Date(351));
    }

    @Test
    public void carst_test() {
        assertEquals(0.5, CarsPro.carst(15,10,10,20));
    }

    @Test
    public void carsx_test() {
        assertEquals(15, CarsPro.carsx(15,10,10,20));
    }

    @Test
    public void carx_test() {
        assertEquals(3, CarsPro.carx(15,5));
    }

    @Test
    public void cart_test() {
        assertEquals(4, CarsPro.cart(36,9));
    }

    @Test
    public void point_test() {
        assertEquals(5, Points.point(15,10));
    }

    @Test
    public void point2D_test() {
        assertEquals(5, Points.point2D(11,12,7,15));
    }

    @Test
    public void point3D_test() {
        assertEquals(13, Points.point3D(1,2,-5,4,6,7));
    }

    @Test
    public void sphere_test() {
        assertEquals(2.636232143305636, Points.sphere(0.2,0.5,0.25,0,0.5,3,2));
    }

    @Test
    public void Line_Point_test() {
        assertEquals(3, Points.Line_Point(3,4,5,2,1));
    }

    @Test
    public void minecraft_test() {
        assertEquals(100, Minecraft.Minecraft(1,2));
        assertEquals(0, Minecraft.Minecraft(12,0));
        assertEquals(80, Minecraft.Minecraft(3,1));
        assertEquals(0, Minecraft.Minecraft(10,0));
        assertEquals(100, Minecraft.Minecraft(2,3));
    }

    @Test
    public void triangle_test(){
        assertEquals(12, Triangle.triP(3,4));
        assertEquals(6,Triangle.triA(3,4));
        assertEquals(53.13010235415598,Triangle.theta(3,4));
        assertEquals(36.86989764584402,Triangle.phi(3,4));
    }

    @Test
    public void rectangle_test(){
        assertEquals(16, Rectangle.recP(3,5));
        assertEquals(15,Rectangle.recA(5,3));
    }

    @Test
    public void circle_test(){
        assertEquals(18.84, Circle.cirP(3));
        assertEquals(78.5,Circle.cirA(5));
    }

    @Test
    public void grades_test(){
        assertEquals("Average: 18.0  Situation: Passed with A",Grades.situation(19,17,18));
        assertEquals("Average: 15.0  Situation: Passed with C",Grades.situation(18,12,15));
        assertEquals("Average: 10.0  Situation: Failed",Grades.situation(10,7,13));
    }

    @Test
    public void person_test() {
        assertEquals("09112121111", Main.FindNum("Zahra"));
        assertEquals("09112111011",Main.FindNum("Hamid"));
        assertEquals("Sara",Main.FindName("09334335373"));
        assertEquals("Reza",Main.FindName("09112113321"));
    }

    @Test
    public void collision_test(){
        assertEquals("Yes", Collision.RecColl(1,-1,2,3,2,0,3,4));
        assertEquals("No", Collision.RecColl(-2,-3,2,3,1,0,2,1));
    }

    @Test
    public void vehicle_test(){
        assertEquals("Yes", vehicle.Main.Info("Mazda3"));
        assertEquals("No", vehicle.Main.Info("VW T6 "));
    }
}
