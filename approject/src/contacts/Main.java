package contacts;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Zahra","Rezaie","09112121111","zahra@gmail.com");
        System.out.println("Student1: \n" + student1.toString() + "\n");
        Student student2 = new Student("Sara","Hamidie","09334335373","sarah@gmail.com");
        System.out.println("Student2: \n" + student2.toString() + "\n");
        Teacher teacher1 = new Teacher("Hamid","Gholami","09112111011","hamidteacher@gmail.com");
        System.out.println("Teacher1: \n" + teacher1.toString() + "\n");
        Teacher teacher2 = new Teacher("Reza","Khosravi","09112113321","rezamath@gmail.com");
        System.out.println("Teacher2: \n" + teacher2.toString() + "\n");
    }

    public static String FindNum(String name){
        String ans = "";
        if(name == "Zahra")
            ans = "09112121111";
        if(name == "Sara")
            ans = "09334335373";
        if(name == "Hamid")
            ans = "09112111011";
        if(name == "Reza")
            ans = "09112113321";
        return ans;
    }
    public static String FindName(String num){
        String ans = "";
        if(num == "09112121111")
            ans = "Zahra";
        if(num == "09334335373")
            ans = "Sara";
        if(num == "09112111011")
            ans = "Hamid";
        if(num == "09112113321")
            ans = "Reza";
        return ans;
    }
}
