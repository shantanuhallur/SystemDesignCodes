public class RadioDecVolume extends Command {
        //Single Responsibility of Turning the radio OFF.
        Radio radio;

        RadioDecVolume(Radio radio){
            this.radio = radio;
        }
    
        @Override
        void execute() {
            radio.volumeDecrease();
        }
}
