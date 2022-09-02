package vehicle;

/**
 * every Car is Hatchback or not in addition of each vehicle.
 */
public class Car extends Vehicle{
    String Hatchback;
    public Car(String name, String brand, int year, String hatchback){
        super(name, brand, year);
        Hatchback = hatchback;
    }
    public String toString(){
        return super.toString() + "  Hatchback: " + Hatchback;
    }
}
