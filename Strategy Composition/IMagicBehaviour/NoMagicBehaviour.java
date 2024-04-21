package IMagicBehaviour;

public class NoMagicBehaviour implements IMagicBehaviour{
    @Override
    public void magicAttack() {
        System.out.println("Cant do Magic Attacks");
    }
}