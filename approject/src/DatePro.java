public class DatePro {

    //A year is divided into 12 months and 48 weeks and 365 days.
    static int year = 2022;
    //A month is divided into 4 weeks and 31, 30 or 29 days.
    static int month;
    //A week is divided into 7 days.
    static String week;
    //days
    static int day;

    /**
     * Day starts from Tuesday.
     * 7k days after Tuesday is still Tuesday because week is a repeating cycle that has seven distinct days.
     * @param d days after Tuesday
     * @return day of the week
     */
    public static String daytoD(int d){
        d = d % 7;
        switch(d){
            case 6:
                week = "Monday";
                break;
            case 0:
                week = "Tuesday";
                break;
            case 1:
                week = "Wednesday";
                break;
            case 2:
                week = "Thursday";
                break;
            case 3:
                week = "Friday";
                break;
            case 4:
                week = "Saturday";
                break;
            case 5:
                week = "Sunday";
                break;
        }
        return week;
    }

    /**
     * convert Days to Month and remaining Days.
     * @param d
     * @return Month and Day
     */
    public static String daytoMonth(int d) {
        String Date = "";
        int m;
        if(187 > d){
            month = d / 31;
            day = d - (month * 31);
            month ++;
        }
        else if(336 > d){
            d -= 186;
            m = d / 30;
            month = 7 + m;
            day = d - (m * 30);
        }
        else{
            month = 12;
            day = d - 335;
        }
        Date = String.valueOf(month) + "/" + String.valueOf(day);
        return Date;
    }

    /**
     * Year starts from 2022
     * @param d
     * @return Date
     */
    public static String Date(int d){
        String date = String.valueOf(year) + "/" + String.valueOf(daytoMonth(d))+ " | " + String.valueOf(daytoD(d));
        return date;
    }
}

