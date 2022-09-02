package vehicle;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda3", "Mazda", 2021, "Yes");
        System.out.println("Car: \n" + car1.toString() + "\n");
        Bus bus1 = new Bus("VW T6 ","Volkwagen",2015,"No");
        System.out.println("Bus: \n" + bus1.toString());
    }

    /**
     * this function shows that car or bus has additional options (hatchback or open top) or not.
     * @param data
     * @return yes or no
     */
    public static String Info(String data){
        String ans = "";
        if(data == "Mazda3")
            ans = "Yes";
        if(data == "VW T6 ")
            ans = "No";
        return ans;
    }
}
