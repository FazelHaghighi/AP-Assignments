package contacts;

/**
 * every person has a name , family and number.
 */
public class Person {
    public static String Name;
    public static String Family;
    public static String Number;

    public Person(String name, String family, String number) {
        Name = name;
        Family = family;
        Number = number;
    }
    public String toString(){
        return "Name: " + Name + "\t Family: " + Family + "\t Number: " + Number;
    }
}
