public class Defender extends Player implements Success{

    public Defender(int number) {
        super(number);
    }
    public boolean isSuccessful(){
        return Math.random() < 0.6;
    }
}
