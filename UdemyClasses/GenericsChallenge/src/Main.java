public class Main {

    public static void main(String[] args) {
        BasketballTeam basketballTeam = new BasketballTeam("Chicago Bulls");
        BasketballTeam basketballTeam1 = new BasketballTeam("My second basket team");
        League<BasketballTeam> basketLeague = new League<>("Basket first league");
        basketLeague.addTeam(basketballTeam);
        basketLeague.addTeam(basketballTeam1);

        League<FootballTeam> footballTeamLeague = new League<>("Football league");
        FootballTeam footballTeam = new FootballTeam("first football team");
        FootballTeam footballTeam1 = new FootballTeam("second football team");
        FootballTeam footballTeam2 = new FootballTeam("third football team");
        FootballTeam footballTeam3 = new FootballTeam("fourth football team");
        footballTeamLeague.addTeam(footballTeam);
        footballTeamLeague.addTeam(footballTeam1);
        footballTeamLeague.addTeam(footballTeam2);
        footballTeamLeague.addTeam(footballTeam3);

//        footballTeamLeague.addTeam(basketballTeam);
//        basketLeague.addTeam(footballTeam);


        footballTeam.matchResult(footballTeam1,0,1);
        footballTeam1.matchResult(footballTeam2,2,1);
        footballTeam3.matchResult(footballTeam2,1,1);
        footballTeam3.matchResult(footballTeam,4,1);
        footballTeam.matchResult(footballTeam2,0,2);
        footballTeamLeague.showRankings();

    }
}
