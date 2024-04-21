import IMagicBehaviour.*;
import IPunchBehaviour.*;
import IKickBehaviour.*;

public class Fighter {
    IKickBehaviour kb;
    IPunchBehaviour pb;
    IMagicBehaviour mb;

    Fighter() {
        this.kb = new NoKickBehaviour();
        this.pb = new NoPunchBehaviour();
        this.mb = new NoMagicBehaviour();
    }

    void fight() {
        kb.kick();
        mb.magicAttack();
        pb.punch();
    }
}
