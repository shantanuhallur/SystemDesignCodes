public class AudioPlayer {
    AudioPlayerState state;

    AudioPlayer() {
        this.state = new MP3StandByState();
    }

    public void pressPlay() {
        this.state.pressPlay(this); //calling AudioPlayer's object's AudioPlayerState object reference's
                                    // pressPlay fuction and passing this AudioPlayer object to it.
    }

    public void pressChangeSource() {
        this.state.pressChangeSource(this);
    }


}
