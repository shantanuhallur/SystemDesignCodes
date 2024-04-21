public class MP3StandByState extends AudioPlayerState {

    @Override
    public void pressPlay(AudioPlayer p) {
        System.out.println("Invalid Operation");
    }

    @Override
    public void pressChangeSource(AudioPlayer p) {
        System.out.println("Setting Sorce to Radio");
        p.state = new RadioState();
    }
}
