public abstract class Team<T extends Team> implements Comparable<Team<T>> {
    private String name;
    private String sport;
    int score = 0;
    int played = 0;
    int won = 0;
    int tied = 0;

    public Team(String name, String sport) {
        this.name = name;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getTied() {
        return tied;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    @Override
    public int compareTo(Team<T> o) {
        if (this.getScore() > o.getScore()){
            return -1;
        } else if (this.getScore() < o.getScore()){
            return 1;
        } else {
            return 0;
        }
    }
}
