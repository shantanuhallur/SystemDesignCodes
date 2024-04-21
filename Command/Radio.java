public class Radio {
    int volume = 50;

    void radioOn() {    
        System.out.println("Radio is On");
    }

    void radioOff() {
        System.out.println("Radio is Off");
    }

    void volumeIncrease() {
        this.volume += 1;
        System.out.println("Current Volume is: " + volume);
    }

    void volumeDecrease() {
        this.volume -= 1;
        System.out.println("Current Volume is: " + volume);
    }
}
