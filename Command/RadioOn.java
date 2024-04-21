public class RadioOn extends Command {
        //Single Responsibility of Turning the radio ON.
        Radio radio;

        RadioOn(Radio radio){
            this.radio = radio;
        }
    
        @Override
        void execute() {
            radio.radioOn();
        }
}
