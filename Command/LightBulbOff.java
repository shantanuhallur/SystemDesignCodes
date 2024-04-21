public class LightBulbOff extends Command {
    //Single Responsibility of Turning the bulb OFF.
    LightBulb bulb;

    LightBulbOff(LightBulb bulb){
        this.bulb = bulb;
    }

    @Override
    void execute() {
        bulb.lightOff();
    }
}
