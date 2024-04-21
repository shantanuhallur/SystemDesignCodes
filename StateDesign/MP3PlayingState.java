public class MP3PlayingState extends AudioPlayerState {

    @Override
    public void pressPlay(AudioPlayer p) {
        System.out.println("Paused Mp3");
        p.state = new MP3PausedState();        
    }

    @Override
    public void pressChangeSource(AudioPlayer p) {
        System.out.println("Setting source to radio");
        p.state = new RadioState();
    }

}
