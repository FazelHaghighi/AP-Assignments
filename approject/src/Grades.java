public class Grades {
    /**
     * student has 3 grade for 3 lessons.
     * @param a1 first lesson
     * @param a2 second lesson
     * @param a3 third lesson
     * @return data
     */
    public static String situation(double a1, double a2, double a3){
        String info = "";
        double avg = (a1 + a2 + a3) / 3;
        if(avg == 20)
            info = "Passed with A+";
        else if(avg >= 18)
            info = "Passed with A";
        else if(avg >= 16)
            info = "Passed with B";
        else if(avg >= 14)
            info = "Passed with C";
        else
            info = "Failed";
        return "Average: " + avg + "  Situation: " + info;
    }
}
