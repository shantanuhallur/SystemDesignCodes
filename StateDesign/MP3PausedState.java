public class MP3PausedState extends AudioPlayerState {
   @Override
   public void pressPlay(AudioPlayer p) {
       System.out.println("Playing Mp3");
       p.state = new MP3PlayingState();
   }

   @Override
   public void pressChangeSource(AudioPlayer p) {
       System.out.println("Setting Source to Radio");
       p.state = new RadioState();
   } 
}
