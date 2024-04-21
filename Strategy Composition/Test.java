import IKickBehaviour.Dolichegi;
import IMagicBehaviour.Kamehameha;
import IPunchBehaviour.UpperCutPunch;

public class Test{
    public static void main(String[] args) {
        Fighter Goku = new Fighter();
        Goku.kb = new Dolichegi();
        Goku.mb = new Kamehameha();
        Goku.pb = new UpperCutPunch();
        Goku.fight();

        System.out.println(" ");

        Fighter defaultFighter = new Fighter();
        defaultFighter.fight();
    }
}

