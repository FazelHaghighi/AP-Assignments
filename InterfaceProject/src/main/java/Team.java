public class Team {
    private final String name;
    private final Player[] players;
    private int goals;
    public Team(String name, Player[] players, int goals) {
        this.name = name;
        this.players = players;
        this.goals = goals;
    }
    public String getName(){
        return name;
    }
    public Player[] getPlayers(){
        return players;
    }
    public int getGoals(){
        return goals;
    }
    public void setGoal(){
        goals++;
    }
}
