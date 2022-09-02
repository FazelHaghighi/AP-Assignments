package vehicle;

public class Vehicle {
    /**
     * every vehicle has a name, brand and Production Year.
     */
    public static String Name;
    public static String Brand;
    public static int Year;

    public Vehicle(String name, String brand, int year){
        Name = name;
        Brand = brand;
        Year = year;
    }
    public String toString(){
        return "Name: " + Name + "\t Brand: " + Brand + "\t Year: " + Year;
    }
}
