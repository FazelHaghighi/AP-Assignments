public class Midfielder extends Player implements Success{

    public Midfielder(int number) {
        super(number);
    }
    public boolean isSuccessful(){
        return Math.random() < 0.4;
    }
}
