package IKickBehaviour;

public class NoKickBehaviour implements IKickBehaviour {
    @Override
    public void kick() {
        System.out.println("Sorry Cannot Kick ./././");
    }
}
