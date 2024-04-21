public class LightBulbOn extends Command {
    //Single Responsibility of Turning the bulb ON.
    LightBulb bulb;

    LightBulbOn(LightBulb bulb){
        this.bulb = bulb;
    }

    @Override
    void execute() {
        bulb.lightOn();
    }
}
