public class RadioState extends AudioPlayerState {
    @Override
    public void pressPlay(AudioPlayer p) {
        System.out.println("Changing the Station");
    }

    @Override
    public void pressChangeSource(AudioPlayer p) {
        System.out.println("Going to MP3");
        p.state = new MP3PausedState();
    }

}
