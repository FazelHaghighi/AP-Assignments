public class GoalKeeper extends Player implements Success{

    public GoalKeeper(int number) {
        super(number);
    }
    public boolean isSuccessful(){
        return Math.random() < 0.8;
    }
}
