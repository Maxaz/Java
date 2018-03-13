import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String leagueName;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already on this league");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to the league: " + this.leagueName);
            return true;
        }
    }

    public int numTeams() {
        return this.teams.size();
    }

    public void calculateScore() {
        for (Team i : this.teams) {
            i.setScore((i.getWon() * 2) + i.getTied());
        }
    }

    public void showRankings() {
        calculateScore();
        Collections.sort(teams);
        int samePlace = 0;
        System.out.println(this.leagueName);
        for (int j = 0; j < teams.size(); j++) {
            if ((j > 0) && (teams.get(j - 1).getScore() == teams.get(j).getScore())) {
                System.out.println(j + ". place -> " + teams.get(j).getName() + " with a score of " + teams.get(j).getScore());
                samePlace = j;
            } else if (samePlace>0){
                samePlace++;
                System.out.println(samePlace + ". place -> " + teams.get(j).getName() + " with a score of " + teams.get(j).getScore());
            } else {
                System.out.println((j + 1) + ". place -> " + teams.get(j).getName() + " with a score of " + teams.get(j).getScore());
            }
        }
    }

}
