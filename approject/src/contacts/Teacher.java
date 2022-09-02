package contacts;

/**
 * every teacher has a teacher email in addition of each person.
 */
public class Teacher extends Person{
    public Teacher(String name, String family, String number, String teEmail){
        super(name, family, number);
        TeEmail = teEmail;
    }
    String TeEmail;
    public String toString(){
        return super.toString() + " Teacher Email is: " + TeEmail;
    }
}
