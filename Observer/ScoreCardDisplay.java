public class ScoreCardDisplay implements Observer {
    @Override
    public void update(Subject s) {
        display((CricketData)s);
    }

    public void display(CricketData d) {
        System.out.println("------------------ Score Card -----------------------");
        System.out.println("Runs - " + d.getRuns());
        System.out.println("Wickets - " + d.getWickets());
        System.out.println("Overs - " + d.getOvers());
    }
}
