public class FinalScorePredictionDisplay implements Observer {
    @Override
    public void update(Subject s) {
        display((CricketData)s);
    }

    public void display(CricketData d) {
        System.out.println("------------------ Final Score -----------------------");
        if(d.getWickets() == 0){
            double nrr = d.getRuns() + 1.0 / d.getOvers();
            int pfscore = (int)nrr * 50;
            System.out.println("Predicted Final Score: " + pfscore);
        } else {
            double rpw = d.getRuns() / d.getWickets();
            int pfscore = (int)rpw * 10;
            System.out.println("Predicted Final Score: " + pfscore);
        }
    }
}
