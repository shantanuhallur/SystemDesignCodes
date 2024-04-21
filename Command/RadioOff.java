public class RadioOff extends Command {
        //Single Responsibility of Turning the radio OFF.
        Radio radio;

        RadioOff(Radio radio){
            this.radio = radio;
        }
    
        @Override
        void execute() {
            radio.radioOff();
        }
}
