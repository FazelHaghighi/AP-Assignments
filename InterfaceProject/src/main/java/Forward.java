public class Forward extends Player implements Success{

    public Forward(int number) {
        super(number);
    }
    public boolean isSuccessful(){
        return Math.random() < 0.2;
    }
}
