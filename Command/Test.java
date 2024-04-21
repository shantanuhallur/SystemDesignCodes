class Test {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Radio radio = new Radio();

        Remote remote = new Remote();
        remote.btn1 = new LightBulbOn(bulb);
        remote.btn2 = new LightBulbOff(bulb);
        remote.btn3 = new RadioOn(radio);
        remote.btn4 = new RadioOff(radio);

        remote.button1Click();
        remote.button2Click();
        remote.button3Click();
        remote.button4Click();

        System.out.println("----- Changing the button features -----");
        remote.btn1 = new RadioDecVolume(radio);
        remote.btn2 = new RadioIncVolume(radio);

        remote.button1Click();
        remote.button2Click();
    }
}