public class Remote {
    Command btn1;
    Command btn2;
    Command btn3;
    Command btn4;

    void button1Click() {
        if(btn1==null){
            System.out.println("No Functionality");
            return;
        }
        btn1.execute();
    }

    void button2Click() {
        if(btn2==null){
            System.out.println("No Functionality");
            return;
        }
        btn2.execute();
    }

    void button3Click() {
        if(btn3==null){
            System.out.println("No Functionality");
            return;
        }
        btn3.execute();
    }

    void button4Click() {
        if(btn4==null){
            System.out.println("No Functionality");
            return;
        }
        btn4.execute();
    }
}
