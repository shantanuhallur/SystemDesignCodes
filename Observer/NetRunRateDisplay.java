import javax.swing.plaf.synth.SynthSpinnerUI;

public class NetRunRateDisplay implements Observer {
    @Override
    public void update(Subject s) {
        display((CricketData)s);
    }

    public void display(CricketData d) {
        System.out.println("------------------ NET Run Rate -----------------------");
        double nrr = d.getRuns() + 1.0 / d.getOvers();
        System.out.println("NRR - " + nrr);
    }
}
