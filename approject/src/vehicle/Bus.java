package vehicle;

/**
 * every Bus is Open top or not in addition of each vehicle.
 */
public class Bus extends Vehicle{
    String OpenTop;
    public Bus(String name, String brand, int year, String openTop){
        super(name, brand, year);
        OpenTop = openTop;
    }
    public String toString(){
        return super.toString() + "  Open Top: " + OpenTop;
    }
}
