public class Match {

    public static void main(String[] args) {

        Player[] team1Players = new Player[11];
        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                team1Players[i] = new GoalKeeper(i);
            }
            else if (i < 5) {
                team1Players[i] = new Defender(i);
            }
            else if (i < 9) {
                team1Players[i] = new Midfielder(i);
            }
            else {
                team1Players[i] = new Forward(i);
            }
        }
        Team team1 = new Team("team1",team1Players,0);

        Player[] team2Players = new Player[11];
        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                team2Players[i] = new GoalKeeper(i);
            }
            else if (i < 5) {
                team2Players[i] = new Defender(i);
            }
            else if (i < 9) {
                team2Players[i] = new Midfielder(i);
            }
            else {
                team2Players[i] = new Forward(i);
            }
        }
        Team team2 = new Team("team2", team2Players,0);
        for (int i = 0; i < 90; i++){
            int goalKeeper1Success = 0;
            int defender1Success = 0;
            int midFielder1Success = 0;
            int forward1Success = 0;

            int goalKeeper2Success = 0;
            int defender2Success = 0;
            int midFielder2Success = 0;
            int forward2Success = 0;

            for (int j = 0; j < 11; j++){
                if (j == 0){
                    if (team1.getPlayers()[j].isSuccessful()) goalKeeper1Success++;
                    if (team2.getPlayers()[j].isSuccessful()) goalKeeper2Success++;
                }
                else if (j < 5){
                    if (team1.getPlayers()[j].isSuccessful()) defender1Success++;
                    if (team2.getPlayers()[j].isSuccessful()) defender2Success++;
                }
                else if (j < 9){
                    if (team1.getPlayers()[j].isSuccessful()) midFielder1Success++;
                    if (team2.getPlayers()[j].isSuccessful()) midFielder2Success++;
                }
                else {
                    if (team1.getPlayers()[j].isSuccessful()) forward1Success++;
                    if (team2.getPlayers()[j].isSuccessful()) forward2Success++;
                }
            }
            if (goalKeeper1Success >= 1 && defender1Success >= 3 && midFielder1Success >= 3 && forward1Success >= 1) team1.setGoal();
            if (goalKeeper2Success >= 1 && defender2Success >= 3 && midFielder2Success >= 3 && forward2Success >= 1) team2.setGoal();
        }
        System.out.println(team1.getGoals() + " - " + team2.getGoals());
        if (team1.getGoals() > team2.getGoals()) System.out.println(team1.getName() + " won!");
        else if (team2.getGoals() > team1.getGoals()) System.out.println(team2.getName() + " won!");
        else System.out.println("draw!");
    }
}
