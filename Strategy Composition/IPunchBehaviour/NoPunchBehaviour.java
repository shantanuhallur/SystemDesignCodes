package IPunchBehaviour;

public class NoPunchBehaviour implements IPunchBehaviour {
    @Override
    public void punch() {
        System.out.println("Sorry Cant Punch :(");
    }
}
