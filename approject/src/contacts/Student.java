package contacts;

/**
 * every student has a student email in addition of each person.
 */
public class Student extends Person{
    String StuEmail;
    public Student(String name, String family, String number, String stuEmail){
        super(name, family, number);
        StuEmail = stuEmail;
    }

    public String toString(){
        return super.toString() + " Student Email is: " + StuEmail;
    }
}
