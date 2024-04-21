class Test {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.pressPlay();
        player.pressChangeSource();
        player.pressPlay();
        player.pressChangeSource();
        player.pressPlay();
        player.pressPlay();
    }
}