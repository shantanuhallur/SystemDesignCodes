public class Test {
    public static void main(String[] args) {
        CricketData cd = new CricketData();
        cd.setData(2, 10, 0);

        ScoreCardDisplay scDisplay = new ScoreCardDisplay();
        NetRunRateDisplay nrrDisplay = new NetRunRateDisplay();
        FinalScorePredictionDisplay fspDisplay = new FinalScorePredictionDisplay();

        cd.register(scDisplay);
        cd.register(nrrDisplay);
        cd.register(fspDisplay);

        cd.setData(99, 1, 14);
        cd.setData(150, 3, 20);

        cd.unRegister(fspDisplay);

        cd.setData(200, 6, 30);
    }
}