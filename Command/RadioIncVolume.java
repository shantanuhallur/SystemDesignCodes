public class RadioIncVolume extends Command {
        //Single Responsibility of Turning the radio OFF.
        Radio radio;

        RadioIncVolume(Radio radio){
            this.radio = radio;
        }
    
        @Override
        void execute() {
            radio.volumeIncrease();
        }
}
