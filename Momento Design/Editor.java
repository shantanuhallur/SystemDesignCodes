//Originator
public class Editor {
    String text;
    int cursorX;
    int cursorY;
    int fs;
    String ff;

    void write() {
        //
    }

    void delete() {
        //
    }

    EditorMemento getSnapshot() { //this is important.
        return new EditorMemento(text, cursorX, cursorY, fs, ff);
    }

    void restore (EditorMemento m) {
        this.text = m.getText();
        this.cursorX = m.getcursorX();
        this.cursorY = m.getcursorY();
        this.fs = m.getfs();
        this.ff = m.getff();
    }

    void print() {
        System.out.println("-------------------------------");
        System.out.println(text);
        System.out.println(cursorX);
        System.out.println(cursorY);
        System.out.println(fs);
        System.out.println(ff);
    }

}
